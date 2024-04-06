package com.kukathonF.backend.web.controller;

import com.kukathonF.backend.global.common.SuccessResponse;
import com.kukathonF.backend.web.dto.ItemResponse;
import com.kukathonF.backend.web.service.GiftBoxService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Tag(name = "선물함 API 모음", description = "선물함 관련 API")
public class GiftBoxController {

    private final GiftBoxService giftBoxService;

    @Operation(
            summary = "선물함 조회 API",
            description = "open = true 이면 연 거 false면 안 연 거"
    )
    @ApiResponse(
            responseCode = "200",
            description = "요청이 성공했습니다."
    )
    @GetMapping("/users/{userId}/gift-box")
    public ResponseEntity<SuccessResponse<?>> getItemsInGiftBox(@PathVariable("userId") Long userId,
                                                                       @RequestParam("open") String open) {
        if ("true".equals(open)) {
            giftBoxService.getOpenItemsInGiftBox(userId);
            return SuccessResponse.ok(null);
        }

        List<ItemResponse> findItems = giftBoxService.getNotOpenItemsInGiftBox(userId);
        return SuccessResponse.ok(findItems);
    }
}
