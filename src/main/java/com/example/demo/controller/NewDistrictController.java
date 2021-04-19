package com.example.demo.controller;

import com.example.demo.dao.NewDistrictRepo;
import com.example.demo.entity.NewDistrict;
import com.example.demo.entity.ValueType;
import com.example.demo.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * description: NewDIstrictController
 * date: 4/14/21 8:26 PM
 * author: fourwood
 */
@RestController
@RequestMapping("/api/v1/newdistrict")
public class NewDistrictController {
    @Autowired
    private NewDistrictRepo newDistrictRepo;

    public static final int TYPE_THRESHOLD = 4;

    @RequestMapping(value = "/districts", method = RequestMethod.GET)
    public ResponseEntity getAll() {
        List<NewDistrict> districts = (List<NewDistrict>) newDistrictRepo.findAll();
        List<DistrictNameResponse> ret = new ArrayList<>();
        for(NewDistrict dis : districts) {
            ret.add(new DistrictNameResponse(dis.getDistrictId(), dis.getName()));
        }
        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(value = "/goal/{districtId}", method = RequestMethod.GET)
    public ResponseEntity getGoal(@PathVariable long districtId, @RequestParam int type){
        if(type < 0 || type > TYPE_THRESHOLD) return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
        NewDistrict district = newDistrictRepo.findById(districtId);
        if (district == null) return new ResponseEntity<>("District Not Found!", HttpStatus.NOT_FOUND);
        ValueType valueType = ValueType.values()[type];
        if (valueType == ValueType.LAND) {
            LandResponse response = new LandResponse(district.getGShape(), district.getGFunc(), district.getGGreenland());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else if(valueType == ValueType.ECONOMY) {
            EconomyResponse response = new EconomyResponse(district.getGGini(), district.getGSecurity());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else if(valueType == ValueType.ENVIR) {
            EnvirResponse response = new EnvirResponse(district.getGVentilation(), district.getGWaste());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else if(valueType == ValueType.RESOURCE) {
            ResourceResponse response = new ResourceResponse(district.getGProportion(), district.getGUse(), district.getGRenewable(), district.getGGdp());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else if(valueType == ValueType.TRANS) {
            TransResponse response = new TransResponse(district.getGIntensity(), district.getGDensity(), district.getGCoverage());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        return new ResponseEntity<>("Type error", HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/real/{districtId}", method = RequestMethod.GET)
    public ResponseEntity getReal(@PathVariable long districtId, @RequestParam int type) {
        if(type < 0 || type > TYPE_THRESHOLD) return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
        NewDistrict district = newDistrictRepo.findById(districtId);
        if (district == null) return new ResponseEntity<>("District Not Found!", HttpStatus.NOT_FOUND);
        ValueType valueType = ValueType.values()[type];
        if (valueType == ValueType.LAND) {
            LandResponse response = new LandResponse(district.getRShape(), district.getRFunc(), district.getRGreenland());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else if(valueType == ValueType.ECONOMY) {
            EconomyResponse response = new EconomyResponse(district.getRGini(), district.getRSecurity());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else if(valueType == ValueType.ENVIR) {
            EnvirResponse response = new EnvirResponse(district.getRVentilation(), district.getRWaste());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else if(valueType == ValueType.RESOURCE) {
            ResourceResponse response = new ResourceResponse(district.getRProportion(), district.getRUse(), district.getRRenewable(), district.getRGdp());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else if(valueType == ValueType.TRANS) {
            TransResponse response = new TransResponse(district.getRIntensity(), district.getRDensity(), district.getRCoverage());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        return new ResponseEntity<>("Type error", HttpStatus.BAD_REQUEST);
    }

}
