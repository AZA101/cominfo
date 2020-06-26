package com.mooc.cominfo.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author admin
 * 用程序控制主键生成策略
 */
public class UUIDUtil {

    public static String setUuid(){
        String UUIDS;
        Random random=new Random();
        Integer number=random.nextInt(1000)+100;
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMdd");
        UUIDS=dateFormat.format(new Date())+number;
        return UUIDS;
    }

}
