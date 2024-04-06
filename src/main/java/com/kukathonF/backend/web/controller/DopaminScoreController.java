package com.kukathonF.backend.web.controller;

import com.kukathonF.backend.global.common.SuccessResponse;
import com.kukathonF.backend.web.dto.DopaminScoreResponse;
import com.kukathonF.backend.web.service.DopaminScoreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Tag(name = "도파민 점수 API 모음", description = "도파민 점수 관련 API")
public class DopaminScoreController {
    private final DopaminScoreService dopaminScoreService;

    @Operation(
            summary = "도파민 점수 조회 API",
            description = "도파민 지금까지 최고 점수, 최저 점수, 일주일 평균 점수 반환"
    )
    @ApiResponse(
            responseCode = "200",
            description = "요청이 성공했습니다."
    )
    @GetMapping("/users/{userId}/dopamin-score")
    public ResponseEntity<SuccessResponse<?>> getDopaminScoreInUser(@PathVariable("userId") Long userId) {
        DopaminScoreResponse findScoreResponse = dopaminScoreService.findDopaminScoreByUserId(userId);

        return SuccessResponse.ok(findScoreResponse);
    }
}
