package com.mooc.cominfo.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author admin
 * 货运单数据实体类
 * @Entity注解标明是实体类，表名和实体类名相同的话，@Table注解可以省略
 */
@Entity
@Data
public class WorkersTransportData {
    /*货运id*/
    @Id
    private String billId;
    /*姓名*/
    private String userName;
    /*车牌号*/
    private String sings;
    /*真实货运单号*/
    private String billNumber;
    /*吨位*/
    private double weights;
    /*地址*/
    private String address;
    /*创建时间*/
    private Date createTime;
    /*更新时间*/
    private Date updateTime;
    /*删除标识*/
    private Integer del;
}
