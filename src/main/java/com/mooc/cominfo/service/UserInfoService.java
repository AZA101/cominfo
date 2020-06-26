package com.mooc.cominfo.service;

import com.mooc.cominfo.dataobject.UserInfo;

/**
 * @author admin
 * 员工信息的service
 */
public interface UserInfoService {
    /*通过账号密码验证个人信息*/
    UserInfo check(String phoneNumber, String passwords);

    /*修改个人密码*/
    UserInfo update(String phoneNumber, String passwords);
}
