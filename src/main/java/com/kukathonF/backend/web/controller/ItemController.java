package com.kukathonF.backend.web.controller;

import com.kukathonF.backend.global.common.SuccessResponse;
import com.kukathonF.backend.web.dto.ItemResponse;
import com.kukathonF.backend.web.service.ItemService;
import com.sun.net.httpserver.Authenticator.Success;
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
public class ItemController {

    private final ItemService itemService;

//    @GetMapping("/users/{userId}/items")
//    public ResponseEntity<SuccessResponse<?>> getItems(@PathVariable("userId") Long userId) {
//        List<ItemResponse> findItems = itemService.findUserItems(userId);
//
//        return SuccessResponse.ok(findItems);
//    }

}
