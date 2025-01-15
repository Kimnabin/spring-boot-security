package com.cd.spring_security.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admin")
//@RolesAllowed("ADMIN")
public class AdminController {

    @RolesAllowed("ADMIN")
    @GetMapping("/vip")
    public String zoneVip() {
        return "Welcome to VIP zone";
    }

    @RolesAllowed({"ADMIN", "USER"})
    @GetMapping("/normal")
    public String zoneNormal() {
        return "Welcome to normal zone";
    }

}
