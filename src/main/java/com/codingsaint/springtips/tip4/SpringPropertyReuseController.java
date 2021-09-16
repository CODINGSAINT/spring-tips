package com.codingsaint.springtips.tip4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SpringPropertyReuseController {

    @Value("${app.name}")
    private String appName;

    @Value("${app.description}")
    private String appDesc;

    @GetMapping("app-details")
    public ResponseEntity<?> appDetails(){
        var map= new HashMap<String, Object>();
        map.put("name",appName);
        map.put("desc", appDesc);
        return  new ResponseEntity<>(map, HttpStatus.OK);
    }
}
