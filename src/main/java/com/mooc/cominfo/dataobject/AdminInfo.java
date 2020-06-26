package com.mooc.cominfo.dataobject;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author admin
 * 管理员信息实体类
 * @Entity注解标明是实体类，表名和实体类名相同的话，@Table注解可以省略
 */
@Entity
@Data
public class AdminInfo {
    /*管理员的id*/
    @Id
    private String adminId;
    /*姓名*/
    private String userName;
    /*电话号码*/
    private String phoneNumber;
    /*密码*/
    private String passwords;
    /*创建时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;
    /*更新时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date update_time;
    /*删除标识 0为正常，1为删除*/
    private Integer del;
}
