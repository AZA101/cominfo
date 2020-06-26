package com.mooc.cominfo.constant;

/**
 * @author admin
 * 设置redis的过期时间
 * 接口中定义的变量默认都是public static final,所有可以省略修饰符
 */
public interface RedisConstant {
    /*设置token存储的key以token_为前缀，%s表示当前位置输出一个字符串*/
    String TOKEN_PREFIX = "token_%s";
    Integer EXPIRE = 7200;
}
