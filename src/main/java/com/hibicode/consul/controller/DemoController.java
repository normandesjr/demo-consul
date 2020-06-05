package com.hibicode.consul.controller;

import com.hibicode.consul.properties.MyProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    private MyProps myProps;

    @GetMapping
    public String get() {
        return myProps.getXpto();
    }

}
