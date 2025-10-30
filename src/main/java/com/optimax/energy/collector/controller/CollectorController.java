package com.optimax.energy.collector.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/collector")
public class CollectorController {

    @GetMapping("/ping")
    public ResponseEntity<String> getPing(){
        return new ResponseEntity<>("Running..", HttpStatus.OK);
    }
}
