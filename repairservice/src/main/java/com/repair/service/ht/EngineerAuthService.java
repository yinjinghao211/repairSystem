package com.repair.service.ht;

import com.repair.model.request.ht.EngineerAuthRequest;
import com.repair.model.response.ReturnValue;

/**
 * auther   kangwang
 *
 * success 通过
 * fail    不通过
 */
public interface EngineerAuthService {
    /**
     * 验证经验
     * @param engineerAuthRequest
     * @return
     */
    public ReturnValue AuthExperience(EngineerAuthRequest engineerAuthRequest);

    /**
     * 验证身份
     * @param engineerAuthRequest
     * @return
     */
    public ReturnValue AuthRealName(EngineerAuthRequest engineerAuthRequest);

    /**
     *
     * @param engineerAuthRequest
     * @return
     */
    public ReturnValue AuthSkill(EngineerAuthRequest engineerAuthRequest);
}
