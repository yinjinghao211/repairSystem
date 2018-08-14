package com.repair.exception;

import com.repair.constant.MsgEnum;

/**
 * auther   kangwang
 */
public class ArgumentExceptionCheck {
    private Object value;
    public static void check(Object value) {
        if(value==null)
        {
            throw new RuntimeException(MsgEnum.IS_NULL.getMsg());
        }
    }
}
