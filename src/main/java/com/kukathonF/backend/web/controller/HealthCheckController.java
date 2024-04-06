package com.kukathonF.backend.web.controller;

import com.kukathonF.backend.domain.entity.User;
import com.kukathonF.backend.global.common.SuccessResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public ResponseEntity<SuccessResponse<?>> healthCheck() {

        return SuccessResponse.ok("health check");

    }
    @GetMapping("/username")
    public String test(@AuthenticationPrincipal User user){
        return user.getName();
    }
}
