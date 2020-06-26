package com.mooc.cominfo.repository;


import com.mooc.cominfo.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserInfoRepository extends JpaRepository<UserInfo,String>, JpaSpecificationExecutor<UserInfo> {
    /*通过电话号码作为账号查询信息*/
   UserInfo findByPhoneNumber(String phoneNumber);
   /*根据姓名查询员工信息*/
   UserInfo findByUserName(String userName);
   /*根据账号和密码进行登陆查询*/
   UserInfo findByPhoneNumberAndPasswords(String phoneNumber,String passwords);

}
