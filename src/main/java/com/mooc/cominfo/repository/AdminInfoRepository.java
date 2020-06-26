package com.mooc.cominfo.repository;

import com.mooc.cominfo.dataobject.AdminInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdminInfoRepository extends JpaRepository<AdminInfo,String>, JpaSpecificationExecutor <AdminInfo>{
   
}
