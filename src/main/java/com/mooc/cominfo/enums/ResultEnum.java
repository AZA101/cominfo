package com.mooc.cominfo.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    USERNAME_NOT_NULL(0,"用户姓名不能为空"),
    USER_NOT_EXIST(1,"用户不存在")
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
