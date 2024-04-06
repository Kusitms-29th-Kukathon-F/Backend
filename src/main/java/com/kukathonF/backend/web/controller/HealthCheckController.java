package com.kukathonF.backend.web.controller;

import com.kukathonF.backend.domain.entity.GiftBox;
import com.kukathonF.backend.domain.entity.Item;
import com.kukathonF.backend.domain.entity.Quest;
import com.kukathonF.backend.domain.entity.User;
import com.kukathonF.backend.domain.entity.constant.App;
import com.kukathonF.backend.domain.entity.constant.Grade;
import com.kukathonF.backend.domain.entity.constant.Period;
import com.kukathonF.backend.domain.repository.GiftBoxRepository;
import com.kukathonF.backend.domain.repository.ItemRepository;
import com.kukathonF.backend.domain.repository.QuestRepository;
import com.kukathonF.backend.domain.repository.UserRepository;
import com.kukathonF.backend.domain.entity.User;
import com.kukathonF.backend.global.common.SuccessResponse;
import java.time.LocalDate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
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
