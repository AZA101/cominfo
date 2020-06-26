package com.mooc.cominfo.repository;

import com.mooc.cominfo.dataobject.AdminInfo;
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
public class AdminInfoRepositoryTest {
    @Autowired
    private AdminInfoRepository adminInfoRepository;

    @Test
    public void saveTest() {
        AdminInfo adminInfo = new AdminInfo();
        adminInfo.setUserName("张飞");
        adminInfo.setPasswords("222");
        adminInfo.setDel(DataEnum.NORMAL.getCode());
        adminInfo.setPhoneNumber("121");
        adminInfo.setAdminId(UUIDUtil.setUuid());
        adminInfo.setCreate_time(new Date());
        adminInfo.setUpdate_time(new Date());
        AdminInfo result = adminInfoRepository.save(adminInfo);
        Assert.assertNotNull(result);
    }


}