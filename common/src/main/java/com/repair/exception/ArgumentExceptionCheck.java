package com.repair.exception;

import com.repair.constant.MsgEnum;

import java.lang.reflect.Field;

/**
 * auther   kangwang
 *
 * 效验内容是否为null
 *
 *boolean flag = false;
 * for(Field f : value.getClass().getDeclaredFields()){
 * f.setAccessible(true);
 * if(f.get(value)==null||f.get(value).equals("")){
 * flag = true;
 * return flag;
 * }
 * }
 * return flag;
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
