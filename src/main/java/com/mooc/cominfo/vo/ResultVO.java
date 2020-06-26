package com.mooc.cominfo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author admin
 * 返回给前端的json数据
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -1599883195579949579L;
    /*提示码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*返回的具体内容*/
    private T data;
}
