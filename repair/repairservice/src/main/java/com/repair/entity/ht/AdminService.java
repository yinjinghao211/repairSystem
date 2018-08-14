package com.repair.entity.ht;

import com.repair.model.request.ht.AdminLoginRequest;
import com.repair.model.response.ReturnValue;

import javax.servlet.http.HttpServletRequest;

/**
 * auther   kangwang
 */
public interface AdminService {
    public ReturnValue login(AdminLoginRequest adminLoginRequest);

    public void loginout();
}
