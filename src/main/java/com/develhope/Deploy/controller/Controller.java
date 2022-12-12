package com.develhope.Deploy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping("")
    public String getName(){
        String name = environment.getProperty("devName");
        return name;
    }
}
