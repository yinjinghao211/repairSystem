package com.repair.service.ht.impl;

import com.repair.dao.ht.UserEntityRepositry;
import com.repair.constant.MsgEnum;
import com.repair.entity.ht.UserEntity;
import com.repair.exception.ArgumentExceptionCheck;;
import com.repair.model.request.ht.AdminLoginRequest;
import com.repair.model.response.ReturnValue;
import com.repair.service.ht.AdminService;
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

    @Autowired private UserEntityRepositry infoEntityRepositry;

    @Override
    public ReturnValue  login(AdminLoginRequest adminLoginRequest) {
        ArgumentExceptionCheck.check(adminLoginRequest);
        ReturnValue returnValue = new ReturnValue();
        ServletRequestAttributes attributes =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        UserEntity userEntity = infoEntityRepositry.findUserEntityByNameAndPassword(adminLoginRequest.getUsername(),adminLoginRequest.getPassword());
        try{
            request.getSession().setAttribute("info", userEntity.getName());
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
