package com.example.demo.dao;

import com.example.demo.entity.DynamicMonitor;
import com.example.demo.entity.NewDistrict;
import org.springframework.data.repository.CrudRepository;

/**
 * description: DynamicMonitorRepo
 * date: 4/19/21 9:25 PM
 * author: fourwood
 */
public interface DynamicMonitorRepo extends CrudRepository<DynamicMonitor, Long> {
    DynamicMonitor findById(long id);
}
