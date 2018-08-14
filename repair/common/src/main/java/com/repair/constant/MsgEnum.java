package com.repair.constant;

import com.repair.model.response.ReturnValue;

public enum MsgEnum {
    IS_NULL("参数为空！"),
    LOGIN_SUCCESS("登录成功！"),
    LOGIN_FAILED("登录失败！");
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
