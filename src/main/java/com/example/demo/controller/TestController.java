package com.example.demo.controller;

import com.example.demo.entity.DynamicMonitor;
import com.example.demo.response.DistrictNameResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * description: TestController
 * date: 4/19/21 9:44 PM
 * author: fourwood
 */
@RestController
@RequestMapping(value = "/")
public class TestController {
    @RequestMapping(value = "/")
    public ResponseEntity test() {
        return new ResponseEntity<>("test succeed", HttpStatus.OK);
    }
}
