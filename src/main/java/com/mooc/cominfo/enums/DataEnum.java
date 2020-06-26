package com.mooc.cominfo.enums;

import lombok.Getter;

/**
 * @author admin
 * 各个数据的状态标识
 */
@Getter
public enum DataEnum {
    NORMAL(0, "存在"),
    DEL(1, "删除");
    private Integer code;
    private String msg;

    DataEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
