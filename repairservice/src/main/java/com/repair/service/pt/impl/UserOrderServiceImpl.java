package com.repair.service.pt.impl;

import com.repair.constant.ConstantMsg;
import com.repair.constant.MsgEnum;
import com.repair.dao.pt.UserOrderEntityRepositry;
import com.repair.entity.pt.UserOrderEntity;
import com.repair.exception.ArgumentExceptionCheck;
import com.repair.model.request.ht.AdminLoginInfo;
import com.repair.model.request.pt.UserAddOrdrerRequest;
import com.repair.model.response.ReturnValue;
import com.repair.service.pt.UserOrderService;

import java.sql.Timestamp;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * auther   kangwang
 */
public class UserOrderServiceImpl implements UserOrderService {

    @Autowired private UserOrderEntityRepositry userOrderEntityRepositry;

    @Override
    public ReturnValue AddOrder(UserAddOrdrerRequest userAddOrdrerRequest) {
        ArgumentExceptionCheck.check(userAddOrdrerRequest);

        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        AdminLoginInfo adminLoginInfo  = (AdminLoginInfo) request.getSession().getAttribute(ConstantMsg.ATTRIBUTE);
        UserOrderEntity userOrderEntity = new UserOrderEntity();
        BeanUtils.copyProperties(userAddOrdrerRequest,userOrderEntity);
        userOrderEntity.setCreateDate((Timestamp) new Date());
        userOrderEntity.setCurrentStatus(ConstantMsg.INIT);
        userOrderEntity.setUserId();




        userOrderEntityRepositry.save(userOrderEntity);
        return null;
    }
}
