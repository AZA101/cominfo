package com.mooc.cominfo.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author admin
 * 管理员管理的货运单数据
 */
@Entity
@Data
public class AdminTransportData {
    /*货运id*/
    @Id
    private String billId;
    /*用户名称*/
    private String userName;
    /*车牌号*/
    private String sings;
    /*真实货运单号*/
    private String billNumber;
    /*吨位*/
    private double weights;
    /*货运地址*/
    private String address;
    /*填写人员姓名*/
    private String adminName;
    /*创建时间*/
    private String createTime;
    /*更新时间*/
    private String updateTime;
    /*删除标识*/
    private Integer del;
}
