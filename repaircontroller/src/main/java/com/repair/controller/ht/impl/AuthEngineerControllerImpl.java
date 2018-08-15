package com.repair.controller.ht.impl;

import com.repair.controller.ht.AuthEngineerController;
import com.repair.model.request.ht.EngineerAuthRequest;
import com.repair.model.response.ReturnValue;
import com.repair.service.ht.impl.EngineerAuthSeriveImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * auther   kangwang
 */
@RestController
public class AuthEngineerControllerImpl implements AuthEngineerController {

    @Autowired private EngineerAuthSeriveImpl engineerAuthSerive;

    @Override
    public ReturnValue AuthExperience(@RequestBody EngineerAuthRequest engineerAuthRequest) {
        return engineerAuthSerive.AuthExperience(engineerAuthRequest);
    }

    @Override
    public ReturnValue AuthRealName(@RequestBody EngineerAuthRequest engineerAuthRequest) {
        return engineerAuthSerive.AuthRealName(engineerAuthRequest);
    }

    @Override
    public ReturnValue AuthSkill(@RequestBody EngineerAuthRequest engineerAuthRequest) {
        return engineerAuthSerive.AuthSkill(engineerAuthRequest);
    }
}
