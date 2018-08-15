package com.repair.service.ht.impl;

import com.repair.constant.ConstantMsg;
import com.repair.constant.MsgEnum;
import com.repair.dao.pt.EngineerExperienceEntityRepositry;
import com.repair.dao.pt.EngineerRealnameauthenticationEntityRepositry;
import com.repair.dao.pt.EngineerSkillauthenticationEntityRepositry;
import com.repair.entity.pt.EngineerExperienceEntity;
import com.repair.entity.pt.EngineerRealnameauthenticationEntity;
import com.repair.entity.pt.EngineerSkillauthenticationEntity;
import com.repair.exception.ArgumentExceptionCheck;
import com.repair.exception.BaseException;
import com.repair.model.request.ht.EngineerAuthRequest;
import com.repair.model.response.ReturnValue;
import com.repair.service.ht.EngineerAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * auther   kangwang
 */
@Service
public class EngineerAuthSeriveImpl implements EngineerAuthService {

    @Autowired private EngineerExperienceEntityRepositry engineerExperienceEntityRepositry;
    @Autowired private EngineerRealnameauthenticationEntityRepositry engineerRealnameauthenticationEntityRepositry;
    @Autowired private EngineerSkillauthenticationEntityRepositry engineerSkillauthenticationEntityRepositry;
    @Override
    public ReturnValue AuthExperience(EngineerAuthRequest engineerAuthRequest) {
        ArgumentExceptionCheck.check(engineerAuthRequest);

        ReturnValue returnValue = new ReturnValue();
        EngineerExperienceEntity engineerExperienceEntity = engineerExperienceEntityRepositry.findById(engineerAuthRequest.getId()).get();
        if("SUCCESS".equalsIgnoreCase(engineerAuthRequest.getStatus())) {
            engineerExperienceEntity.setStatus(ConstantMsg.AUTH_SUCCESS);
            returnValue.setMsg(MsgEnum.AUTH_SUCCESS.getMsg());
        }else if("FAIL".equalsIgnoreCase(engineerAuthRequest.getStatus()))
        {
            engineerExperienceEntity.setStatus(ConstantMsg.AUTH_FAIL);
            returnValue.setMsg(MsgEnum.AUTH_FAIL.getMsg());
        }else {
            throw new BaseException(MsgEnum.ARGUMENT_ILLEGAL.getMsg());
        }
        engineerExperienceEntityRepositry.save(engineerExperienceEntity);
        returnValue.setMsg(MsgEnum.AUTH_SUCCESS.getMsg());
        return returnValue;
    }

    @Override
    public ReturnValue AuthRealName(EngineerAuthRequest engineerAuthRequest) {
        ArgumentExceptionCheck.check(engineerAuthRequest);

        ReturnValue returnValue = new ReturnValue();
        EngineerRealnameauthenticationEntity engineerRealnameauthenticationEntity =engineerRealnameauthenticationEntityRepositry.findById(engineerAuthRequest.getId()).get();
        if("SUCCESS".equalsIgnoreCase(engineerAuthRequest.getStatus())) {
            engineerRealnameauthenticationEntity.setStatus(ConstantMsg.AUTH_SUCCESS);
            returnValue.setMsg(MsgEnum.AUTH_SUCCESS.getMsg());
        }else if("FAIL".equalsIgnoreCase(engineerAuthRequest.getStatus()))
        {
            engineerRealnameauthenticationEntity.setStatus(ConstantMsg.AUTH_FAIL);
            returnValue.setMsg(MsgEnum.AUTH_FAIL.getMsg());
        }else {
            throw new BaseException(MsgEnum.ARGUMENT_ILLEGAL.getMsg());
        }
        engineerRealnameauthenticationEntityRepositry.save(engineerRealnameauthenticationEntity);
        returnValue.setMsg(MsgEnum.AUTH_SUCCESS.getMsg());
        return returnValue;
    }

    @Override
    public ReturnValue AuthSkill(EngineerAuthRequest engineerAuthRequest) {
        ArgumentExceptionCheck.check(engineerAuthRequest);

        ReturnValue returnValue = new ReturnValue();
        EngineerSkillauthenticationEntity engineerSkillauthenticationEntity =engineerSkillauthenticationEntityRepositry.findById(engineerAuthRequest.getId()).get();
        if("SUCCESS".equalsIgnoreCase(engineerAuthRequest.getStatus())){
            engineerSkillauthenticationEntity.setStatus(ConstantMsg.AUTH_SUCCESS);
            returnValue.setMsg(MsgEnum.AUTH_SUCCESS.getMsg());
        }else if("FAIL".equalsIgnoreCase(engineerAuthRequest.getStatus()))
        {
            engineerSkillauthenticationEntity.setStatus(ConstantMsg.AUTH_FAIL);
            returnValue.setMsg(MsgEnum.AUTH_FAIL.getMsg());
        }else {
            throw new BaseException(MsgEnum.ARGUMENT_ILLEGAL.getMsg());
        }
        engineerSkillauthenticationEntityRepositry.save(engineerSkillauthenticationEntity);

        return returnValue;
    }
}
