package com.mooc.cominfo.repository;

import com.mooc.cominfo.dataobject.AdminTransportData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdminTransportDataRepository extends JpaRepository<AdminTransportData,String>, JpaSpecificationExecutor<AdminTransportData> {
}
