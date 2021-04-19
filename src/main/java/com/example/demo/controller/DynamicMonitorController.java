package com.example.demo.controller;

import com.example.demo.dao.DynamicMonitorRepo;
import com.example.demo.entity.DynamicMonitor;
import com.example.demo.entity.NewDistrict;
import com.example.demo.response.DistrictNameResponse;
import com.example.demo.response.DynamicMonitorStandard;
import com.example.demo.response.DynamicMonitorValue;
import com.example.demo.response.LandResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * description: DynamicMonitorController
 * date: 4/19/21 9:26 PM
 * author: fourwood
 */
@RestController
@RequestMapping("/api/v1/monitor")
public class DynamicMonitorController {
    @Autowired
    private DynamicMonitorRepo dynamicMonitorRepo;

    @RequestMapping(value = "/districts", method = RequestMethod.GET)
    public ResponseEntity getAll() {
        List<DynamicMonitor> districts = (List<DynamicMonitor> )dynamicMonitorRepo.findAll();
        List<DistrictNameResponse> ret = new ArrayList<>();
        for(DynamicMonitor dis : districts) {
            ret.add(new DistrictNameResponse(dis.getDistrictId(), dis.getName()));
        }
        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(value = "/standard/{districtId}", method = RequestMethod.GET)
    public ResponseEntity getStandard(@PathVariable long districtId) {
        DynamicMonitor district = dynamicMonitorRepo.findById(districtId);
        if (district == null) return new ResponseEntity<>("District Not Found!", HttpStatus.NOT_FOUND);
        DynamicMonitorStandard response = new DynamicMonitorStandard(district);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/value/{districtId}", method = RequestMethod.GET)
    public ResponseEntity getValue(@PathVariable long districtId) {
        DynamicMonitor district = dynamicMonitorRepo.findById(districtId);
        if (district == null) return new ResponseEntity<>("District Not Found!", HttpStatus.NOT_FOUND);
        DynamicMonitorValue response = new DynamicMonitorValue(district);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
