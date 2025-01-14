package com.cd.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/admin")
public class AdminController {

    @GetMapping("/vip")
    public String zoneVip() {
        return "Welcome to VIP zone";
    }

    @GetMapping("/normal")
    public String zoneNormal() {
        return "Welcome to normal zone";
    }

}
