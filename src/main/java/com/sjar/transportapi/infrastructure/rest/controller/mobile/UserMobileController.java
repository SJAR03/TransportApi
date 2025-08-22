package com.sjar.transportapi.infrastructure.rest.controller.mobile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mobile/users")
public class UserMobileController {

    @GetMapping("ping")
    public String ping() {
        return "pong from mobile";
    }

}
