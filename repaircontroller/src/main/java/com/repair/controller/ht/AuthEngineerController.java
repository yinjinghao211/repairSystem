package com.repair.controller.ht;


import com.repair.model.request.ht.EngineerAuthRequest;
import com.repair.model.response.ReturnValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * auther   kangwang
 */
@RequestMapping("auth")
public interface AuthEngineerController {
    /**
     * 验证经验
     * @param engineerAuthRequest
     * @return
     */
    @PostMapping("experience")
    public ReturnValue AuthExperience(@RequestBody EngineerAuthRequest engineerAuthRequest);

    /**
     * 验证身份
     * @param engineerAuthRequest
     * @return
     */
    @PostMapping("realname")
    public ReturnValue AuthRealName(EngineerAuthRequest engineerAuthRequest);

    /**
     *
     * @param engineerAuthRequest
     * @return
     */
    @PostMapping("skill")
    public ReturnValue AuthSkill(EngineerAuthRequest engineerAuthRequest);

}
