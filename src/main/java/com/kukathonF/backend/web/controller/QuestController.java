package com.kukathonF.backend.web.controller;

import com.kukathonF.backend.global.common.SuccessResponse;
import com.kukathonF.backend.web.dto.QuestResponse;
import com.kukathonF.backend.web.service.QuestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Tag(name = "퀘스트 API 모음", description = "퀘스트 관련 API")
public class QuestController {
    private final QuestService questService;

    @Operation(
            summary = "퀘스트 조회 API",
            description = "현재 시간 기준 일주일 전까지의 퀘스트 조회"
    )
    @ApiResponse(
            responseCode = "200",
            description = "요청이 성공했습니다."
    )
    @GetMapping("/users/{userId}/quests")
    public ResponseEntity<SuccessResponse<?>> getQuestInWeek(@PathVariable("userId") Long userId) {
        List<QuestResponse> findQuests = questService.findByUserIdInWeek(userId);
        return SuccessResponse.ok(findQuests);
    }

}
