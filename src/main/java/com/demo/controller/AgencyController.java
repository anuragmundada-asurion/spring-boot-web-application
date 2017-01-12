package com.demo.controller;

import com.demo.services.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class AgencyController {

    @Autowired
    private AgencyService agencyDAO;

    @RequestMapping(value = "/agencies", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAgencies() {
        Map agencies = agencyDAO.getAgencies();
        System.out.println("Test" + agencies);
        if(!agencies.isEmpty()) {
            return new ResponseEntity<Object>(agencies, HttpStatus.OK);
        } else
            return null;
    }
}