package com.mooc.cominfo.repository;

import com.mooc.cominfo.dataobject.WorkersTransportData;
import com.mooc.cominfo.enums.DataEnum;
import com.mooc.cominfo.util.UUIDUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkersTransportDataRepositoryTest {

    @Autowired
    private WorkersTransportDataRepository workersTransportDataRepository;

    @Test
    public void saveTest() {
        WorkersTransportData workersTransportData = new WorkersTransportData();
        workersTransportData.setBillId(UUIDUtil.setUuid());
        workersTransportData.setBillNumber("HL1008");
        workersTransportData.setUserName("程旭");
        workersTransportData.setWeights(56.5);
        workersTransportData.setAddress("云南省临沧市");
        workersTransportData.setSings("云M5623");
        workersTransportData.setCreateTime(new Date());
        workersTransportData.setUpdateTime(new Date());
        workersTransportData.setDel(DataEnum.NORMAL.getCode());
        WorkersTransportData result = workersTransportDataRepository.save(workersTransportData);
        Assert.assertNotNull(result);
    }

    @Test
    public void updateTest() {
      /*  WorkersTransportData result = workersTransportDataRepository.findByBillNumber("HL1002");
        System.out.println(result);
        if (result != null) {
            result.setWeights(55.1);
            workersTransportDataRepository.save(result);
        }*/
    }

    @Test
    public void findByBillNumberAndUserNameTest() {
        WorkersTransportData result=workersTransportDataRepository.findByBillNumberAndUserName("HL1002","赵锐");
        System.out.println(result);
        Assert.assertNotEquals(0,result);
    }

    @Test
    public void findByUserNameTest() {
       /*分页的起始页下标是从0开始*/
        PageRequest request = PageRequest.of(0, 3);
        Page<WorkersTransportData> result = workersTransportDataRepository.findByUserName("袁朗", request);
        Assert.assertNotEquals(0, result.getTotalElements());
    }

}