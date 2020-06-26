package com.mooc.cominfo.service;

import com.mooc.cominfo.dataobject.WorkersTransportData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author admin
 * 员工货运单数据的service
 */
public interface WorkersTransportDataService {
    /*查询自己的某条数据*/
    WorkersTransportData findOne(String billNumber,String userName);
    /*查询自己所有的货运单数据*/
    Page<WorkersTransportData> findAll(String userName, Pageable pageable);
    /*保存货运单数据*/
    WorkersTransportData saveData(WorkersTransportData workersTransportData);

}
