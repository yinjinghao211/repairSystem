package com.repair.controller.ht.impl;

import com.repair.controller.ht.UserController;
import com.repair.model.request.ht.UserAddRequest;
import com.repair.model.request.ht.UsereditRequest;
import com.repair.model.response.ReturnValue;
import com.repair.service.ht.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * auther   kangwang
 */
@RestController
public class UserControllerImpl implements UserController {

    @Autowired private UserServiceImpl userService;

    @Override
    public ReturnValue addUser(@RequestBody UserAddRequest userAddRequest) {
        return userService.addUser(userAddRequest);
    }

    @Override
    public ReturnValue editUser(@RequestBody UsereditRequest usereditRequest) {
        return userService.editUser(usereditRequest);
    }

    @Override
    public ReturnValue deleteUser(@PathVariable String id) {
        return userService.deleteUser(id);
    }

    @Override
    public ReturnValue findUser(@PathVariable String id) {
        return userService.findUser(id);
    }
}
