package com.repair.service.ht;

import com.repair.model.request.ht.UserAddRequest;
import com.repair.model.request.ht.UsereditRequest;
import com.repair.model.response.ReturnValue;

/**
 * auther   kangwang
 */
public interface UserService {
    /**
     * 增加
     * @param userAddRequest
     * @return
     */
    public ReturnValue addUser(UserAddRequest userAddRequest);

    /**
     * 修改
     * @param usereditRequest
     * @return
     */
    public ReturnValue editUser(UsereditRequest usereditRequest);

    /**
     * 删除
     * @param id
     * @return
     */
    public ReturnValue deleteUser(String id);

    /**
     *
     * @param id
     * @return
     */
    public ReturnValue findUser(String id);

}
