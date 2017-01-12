package com.demo.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AgencyService {

    public Map getAgencies() {
        //List agencies = new ArrayList();
        Map result = new HashMap();
        result.put("1", "Agency1");
        result.put("2", "Agency2");

        return result;
    }
}
