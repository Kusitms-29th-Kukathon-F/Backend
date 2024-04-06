package com.kukathonF.backend;

import com.kukathonF.backend.global.common.SuccessResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public ResponseEntity<SuccessResponse<?>> healthCheck() {

        return SuccessResponse.ok("health check");
    }
}
