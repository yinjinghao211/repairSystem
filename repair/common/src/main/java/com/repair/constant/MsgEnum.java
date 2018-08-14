package com.repair.constant;

import com.repair.model.response.ReturnValue;

public enum MsgEnum {
    IS_NULL("参数为空！"),
    LOGIN_SUCCESS("登录成功！"),
    LOGIN_FAILED("登录失败！"),
    USER_SAVE_SUCCESS("保存成功！"),
    USER_EDIT_SUCCESS("修改成功！"),USER_NOT_FIND ("数据不存在！"), USER_DLETESUCCESS("用户删除成！"), USER_FIND_SUCCESS("查找成！");
    private String Msg;

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    MsgEnum(String msg) {
        Msg = msg;
    }
}
