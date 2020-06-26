package com.mooc.cominfo.repository;

import com.mooc.cominfo.dataobject.WorkersTransportData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WorkersTransportDataRepository extends JpaRepository<WorkersTransportData,String>, JpaSpecificationExecutor<WorkersTransportData> {
    /*通过真实的货运单号进行查询*/
    WorkersTransportData findByBillNumberAndUserName(String billNumber,String userName);
    Page<WorkersTransportData>findByUserName(String userName, Pageable pageable);

}
