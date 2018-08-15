package com.repair.controller.ht;

import com.repair.model.request.ht.UserAddRequest;
import com.repair.model.request.ht.UsereditRequest;
import com.repair.model.response.ReturnValue;
import org.springframework.web.bind.annotation.*;

/**
 * auther   kangwang
 *
 * 工作人员操作
 */
@RequestMapping("user")
public interface UserController {
    /**
     * 增加
     * @param userAddRequest
     * @return
     */
    @PostMapping("add")
    public ReturnValue addUser(@RequestBody UserAddRequest userAddRequest);

    /**
     * 修改
     * @param usereditRequest
     * @return
     */
    @PostMapping("edit")
    public ReturnValue editUser(@RequestBody UsereditRequest usereditRequest);

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("delete/{id}")
    public ReturnValue deleteUser(@PathVariable("id") String id);

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("find/{id}")
    public ReturnValue findUser(@PathVariable("id") String id);


}
