package com.mooc.cominfo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author admin
 * 控制时间输出格式
 */
public class DateUtil {
    public static String setDate(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr=simpleDateFormat.format(new Date());
        return  dateStr;
    }
}
