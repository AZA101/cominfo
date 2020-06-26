package com.mooc.cominfo.service.serviceImpl;

import com.mooc.cominfo.dataobject.WorkersTransportData;
import com.mooc.cominfo.repository.WorkersTransportDataRepository;
import com.mooc.cominfo.service.WorkersTransportDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class WorkersTransportDataServiceImpl implements WorkersTransportDataService {

    @Autowired
    private WorkersTransportDataRepository repository;

    @Override
    public WorkersTransportData findOne(String billNumber,String userName) {
        //TODO 这里需要封装一下可能的错误信息
        return repository.findByBillNumberAndUserName(billNumber,userName);
    }

    @Override
    public Page<WorkersTransportData> findAll(String userName, Pageable pageable) {
        return repository.findByUserName(userName,pageable);
    }

    @Override
    public WorkersTransportData saveData(WorkersTransportData workersTransportData) {
        return repository.save(workersTransportData);
    }

}
