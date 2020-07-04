package com.x5.ldapdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LdapController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }
}
