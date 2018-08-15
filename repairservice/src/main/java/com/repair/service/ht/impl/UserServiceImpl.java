package com.repair.service.ht.impl;

import com.repair.constant.MsgEnum;
import com.repair.dao.ht.UserEntityRepositry;
import com.repair.entity.ht.UserEntity;
import com.repair.exception.ArgumentExceptionCheck;
import com.repair.model.request.ht.UserAddRequest;
import com.repair.model.request.ht.UsereditRequest;
import com.repair.model.response.ReturnValue;
import com.repair.model.response.UserResponse;
import com.repair.service.ht.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * auther   kangwang
 * 2018-8-14
 *
 * 缺少添加的时候，需要使用增加操作人信息，aop权限加之后在进行测试
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserEntityRepositry userEntityRepositry;

    @Override
    public ReturnValue addUser(UserAddRequest userAddRequest) {
        ArgumentExceptionCheck.check(userAddRequest);


        ReturnValue returnValue = new ReturnValue();
        UserResponse userAddResponse = new UserResponse();
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userAddRequest,userEntity);
        userEntityRepositry.save(userEntity);
        returnValue.setMsg(MsgEnum.USER_SAVE_SUCCESS.getMsg());
        BeanUtils.copyProperties(userEntity,userAddResponse);
        returnValue.setData(userAddResponse);
        return returnValue;
    }

    @Override
    public ReturnValue editUser(UsereditRequest usereditRequest) {
        ArgumentExceptionCheck.check(usereditRequest);

        ReturnValue returnValue = new ReturnValue();
        UserEntity userEntity = new UserEntity();
        UserResponse userResponse =new UserResponse();
        try {
            userEntity = userEntityRepositry.findById(usereditRequest.getId()).get();
        }catch (Exception e) {
            returnValue.setMsg(MsgEnum.USER_NOT_FIND.getMsg());
            return returnValue;
        }
        BeanUtils.copyProperties(usereditRequest,userEntity);
        userEntityRepositry.save(userEntity);
        returnValue.setMsg(MsgEnum.USER_EDIT_SUCCESS.getMsg());
        BeanUtils.copyProperties(userEntity,userResponse);
        returnValue.setData(userResponse);
        return returnValue;
    }

    @Override
    public ReturnValue deleteUser(String id) {
        ArgumentExceptionCheck.check(id);

        UserResponse userResponse = new UserResponse();
        UserEntity userEntity = new UserEntity();
        ReturnValue returnValue = new ReturnValue();
        try {
            userEntity = userEntityRepositry.findById(id).get();
        }catch (Exception e){
            returnValue.setMsg(MsgEnum.USER_NOT_FIND.getMsg());
            return returnValue;
        }
        userEntityRepositry.delete(userEntity);
        returnValue.setMsg(MsgEnum.USER_DLETESUCCESS.getMsg());
        BeanUtils.copyProperties(userEntity,userResponse);
        returnValue.setData(userResponse);
        return returnValue;
    }

    @Override
    public ReturnValue findUser(String id) {
        ArgumentExceptionCheck.check(id);

        UserResponse userResponse = new UserResponse();
        UserEntity userEntity = new UserEntity();
        ReturnValue returnValue = new ReturnValue();
        try {
            userEntity = userEntityRepositry.findById(id).get();
        }catch (Exception e){
            returnValue.setMsg(MsgEnum.USER_NOT_FIND.getMsg());
            return returnValue;
        }
        BeanUtils.copyProperties(userEntity,userResponse);
        returnValue.setData(userResponse);
        returnValue.setMsg(MsgEnum.USER_FIND_SUCCESS.getMsg());
        return returnValue;
    }
}
