package com.sjar.transportapi.infrastructure.rest.controller.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/web/users")
public class UserWebController {

    @GetMapping("ping")
    public String ping() {
        return "pong from web";
    }

}
