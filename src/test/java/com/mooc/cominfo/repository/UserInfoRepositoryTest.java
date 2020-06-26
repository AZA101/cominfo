package com.mooc.cominfo.repository;

import com.mooc.cominfo.dataobject.UserInfo;
import com.mooc.cominfo.enums.DataEnum;
import com.mooc.cominfo.util.UUIDUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoRepositoryTest {
    @Autowired
    private UserInfoRepository userInfoRepository;
    private static String phoneNumber="15102052326";
    private static String userName="张三";
    private static String passwords="123";
    @Test
    public void findByPhoneNumberTest(){
        UserInfo userInfo =userInfoRepository.findByPhoneNumber(phoneNumber);
        System.out.println(userInfo);
        Assert.assertNotNull(userInfo);
    }
    @Test
    public void findByUserNameTest(){
        UserInfo userInfo=userInfoRepository.findByUserName(userName);
        System.out.println(userInfo);
        Assert.assertNotNull(userInfo);
    }
    @Test
    public void findByPhoneNumberAndPasswordsTest(){
        UserInfo userInfo=userInfoRepository.findByPhoneNumberAndPasswords(phoneNumber,passwords);
        System.out.println(userInfo);
        Assert.assertNotNull(userInfo);
    }
    @Test
    public void saveTest(){
        UserInfo userInfo=new UserInfo();
        userInfo.setPersonId(UUIDUtil.setUuid());
        userInfo.setUserName("刘洋");
        userInfo.setSings("云M1130");
        userInfo.setPhoneNumber("20208");
        userInfo.setPasswords("20208");
        userInfo.setCreate_time(new Date());
        userInfo.setUpdate_time(new Date());
        userInfo.setDel(DataEnum.NORMAL.getCode());
        UserInfo result=userInfoRepository.save(userInfo);
        Assert.assertNotNull(result);
    }
    @Test
    public void updateTest(){
        UserInfo userInfo=userInfoRepository.findByPhoneNumber(phoneNumber);
        if(userInfo!=null){
            userInfo.setPasswords("0826");
            UserInfo result=userInfoRepository.save(userInfo);
            System.out.println(result);
            Assert.assertNotEquals(0,result);
        }else{
            System.out.println("没有这条记录");
        }

    }

}