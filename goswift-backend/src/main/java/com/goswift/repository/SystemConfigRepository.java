package com.goswift.repository;

import com.goswift.entity.SystemConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SystemConfigRepository extends JpaRepository<SystemConfig, Integer> {
    
}