package com.starter.MyFirstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;



    @RequestMapping("/currency-configuration")  // Handles GET requests for "/courses"
    @ResponseBody
    public CurrencyServiceConfiguration retrieveAllConfiguration() {
        return configuration;
    }
    //@GetMapping
}