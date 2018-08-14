package com.repair.entity.ht.impl;

import com.repair.entity.ht.AdminService;
import com.repair.constant.MsgEnum;
import com.repair.entity.ht.InfoEntity;
import com.repair.exception.ArgumentExceptionCheck;
import com.repair.ht.InfoEntityRepositry;
import com.repair.model.request.ht.AdminLoginRequest;
import com.repair.model.response.ReturnValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * auther   kangwang
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired private InfoEntityRepositry infoEntityRepositry;

    @Override
    public ReturnValue  login(AdminLoginRequest adminLoginRequest) {
        ArgumentExceptionCheck.check(adminLoginRequest);
        ReturnValue returnValue = new ReturnValue();
        ServletRequestAttributes attributes =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        InfoEntity infoEntity = infoEntityRepositry.findInfoEntitiesByUsernameAndPassword(adminLoginRequest.getUsername(),adminLoginRequest.getPassword());
        try{
            request.getSession().setAttribute("info", infoEntity.getUsername());
            System.out.println(infoEntity.getEmail());
            returnValue.setMsg(MsgEnum.LOGIN_SUCCESS.getMsg());
        }catch (Exception e){
            returnValue.setMsg(MsgEnum.LOGIN_FAILED.getMsg());
        }
        return returnValue;
    }

    @Override
    public void loginout() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        request.getSession().invalidate();
    }
}
