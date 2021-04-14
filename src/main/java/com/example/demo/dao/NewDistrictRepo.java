package com.example.demo.dao;

import com.example.demo.entity.NewDistrict;
import org.springframework.data.repository.CrudRepository;

/**
 * description: NewDistrictRepo
 * date: 4/14/21 8:22 PM
 * author: fourwood
 */
public interface NewDistrictRepo extends CrudRepository<NewDistrict, Long> {
    NewDistrict findById(long id);
}
