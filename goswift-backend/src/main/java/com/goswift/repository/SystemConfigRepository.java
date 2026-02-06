package com.goswift.repository;

import com.goswift.entity.SystemConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemConfigRepository extends JpaRepository<SystemConfig, Integer> {
    
    // This custom query was missing and causing the build error
    @Query(value = "SELECT * FROM system_config LIMIT 1", nativeQuery = true)
    SystemConfig getGlobalConfig();
}
