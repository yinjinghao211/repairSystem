package com.repair.login.ht.impl;

import com.repair.entity.ht.impl.AdminServiceImpl;
import com.repair.login.ht.AdminController;
import com.repair.model.request.ht.AdminLoginRequest;
import com.repair.model.response.ReturnValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * auther   kangwang
 */
@RestController
public class AdminControllerImpl implements AdminController {

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @Autowired private AdminServiceImpl adminService;
    @Override
    public ReturnValue login(@RequestBody AdminLoginRequest adminLoginRequest) throws Exception {
        return adminService.login(adminLoginRequest);
    }

    @Override
    public ReturnValue loginout() {
        ReturnValue returnValue = new ReturnValue();
        adminService.loginout();
        returnValue.setMsg("退出成！");
        return returnValue;
    }
}
