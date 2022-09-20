package com.quintrix.dev.ps5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PS5")
public class PS5Controller {

    @GetMapping
    public String getPS5() {return "PS5 is contacting PSN";}
}
