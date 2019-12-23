package com.uhudpoyraz.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationProperties;

@RefreshScope
@RestController
public class CustomerController {

    @Value("${customer.default.count}")
    private int defaultCustomerCount;



    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getCustomerCount(){

        int count = 5*defaultCustomerCount;

        return "Customer count:"+count;
    }
}
