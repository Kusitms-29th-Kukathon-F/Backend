package com.kukathonF.backend.web.controller;

import com.kukathonF.backend.global.common.SuccessResponse;
import com.kukathonF.backend.web.service.TodayQuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TodayQuestController {

    private final TodayQuestService todayQuestService;

    @GetMapping("/quest/today")
    public ResponseEntity<SuccessResponse<?>> healthCheck() {

        return SuccessResponse.ok(todayQuestService.getTodayQuest());

    }
}
