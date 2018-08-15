/*
package com.repair.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.omg.CORBA.UserException;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

*/
/**
 * auther   kangwang
 *//*

@Component
@Aspect
@SuppressWarnings("all")
public class UserAuth {
    @Pointcut("execution(public * com.repair.ht.*.*.*(..))")
    public void role(){

    }

    @Before(value = "role()")
    public void beforeAuth() throws UserException {
        ServletRequestAttributes attributes =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String username = (String)request.getSession().getAttribute("info");

        if(username == null){
            throw new RuntimeException();
        }
        request.getSession().setMaxInactiveInterval(30*60);
    }
}*/
