package com.bootcamptoprod.springbootvaultmavenpluginreadsecrets.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadSecretsController {

    @Value("${prop.username}")
    private String username;

    @Value("${prop.password}")
    private String password;

    @GetMapping("/getSecretsFromVault")
    public String getSecretsFromVault() {
        return "Username: " + username + " Password: " + password;
    }
}
