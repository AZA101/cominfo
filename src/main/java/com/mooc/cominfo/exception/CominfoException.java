package com.mooc.cominfo.exception;

import com.mooc.cominfo.enums.ResultEnum;
import lombok.Getter;

/**
 * @author admin
 * 自定义封装错误信息
 */
@Getter
public class CominfoException extends  RuntimeException{
    private Integer code;

    /**
     * 创建有参构造方法 ，super必须为方法体的首句
     * @param message
     * @param code
     */
    public CominfoException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * 创建有参构造方法，错误信息和错误码从枚举类传递过来，更方便维护
     * @param resultEnums
     */
    public CominfoException(ResultEnum resultEnums){
        super(resultEnums.getMsg());
        this.code=resultEnums.getCode();
    }


}
