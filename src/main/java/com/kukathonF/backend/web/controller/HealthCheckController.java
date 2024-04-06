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

    private final GiftBoxRepository giftBoxRepository;
    private final UserRepository userRepository;
    private final ItemRepository itemRepository;
    private final QuestRepository questRepository;

    @GetMapping("/")
    public ResponseEntity<SuccessResponse<?>> healthCheck() {

        return SuccessResponse.ok("health check");
    }

    @GetMapping("api/set-data")
    @Transactional
    public void setData() {
        User userA = User.builder()
                .name("userA")
                .build();

        User userB = User.builder()
                .name("userB")
                .build();

        userRepository.save(userA);
        userRepository.save(userB);

        Item itemA = Item.builder()
                .name("itemA")
                .isOpen(false)
                .isOpen(false)
                .grade(Grade.NORMAL)
                .build();

        Item itemB = Item.builder()
                .name("itemB")
                .isOpen(true)
                .isOpen(false)
                .grade(Grade.COMMON)
                .build();

        Item itemC = Item.builder()
                .name("itemC")
                .isOpen(false)
                .isOpen(true)
                .grade(Grade.RARE)
                .build();

        itemRepository.save(itemA);
        itemRepository.save(itemB);
        itemRepository.save(itemC);

        GiftBox giftBoxA = GiftBox.builder()
                .period(Period.DAY)
                .isOpen(false)
                .user(userA)
                .item(itemA)
                .build();

        GiftBox giftBoxB = GiftBox.builder()
                .period(Period.DAY)
                .isOpen(true)
                .user(userB)
                .item(itemB)
                .build();

        GiftBox giftBoxC = GiftBox.builder()
                .period(Period.WEEK)
                .isOpen(false)
                .user(userA)
                .item(itemC)
                .build();

        GiftBox giftBoxD = GiftBox.builder()
                .period(Period.WEEK)
                .isOpen(true)
                .user(userA)
                .item(itemC)
                .build();

        giftBoxRepository.save(giftBoxA);
        giftBoxRepository.save(giftBoxB);
        giftBoxRepository.save(giftBoxC);
        giftBoxRepository.save(giftBoxD);

        Quest questA = Quest.builder()
                .ago(1L)
                .message("aaa")
                .isSuccess(false)
                .user(userA)
                .app(App.INSTAGRAM)
                .runningTime(3L)
                .date(LocalDate.now())
                .build();

        LocalDate agoDate = LocalDate.of(2024, 3, 30);
        Quest questB = Quest.builder()
                .ago(2L)
                .message("bbb")
                .isSuccess(true)
                .user(userA)
                .app(App.TWITTER)
                .runningTime(8L)
                .date(agoDate)
                .build();

        Quest questC = Quest.builder()
                .ago(3L)
                .message("c")
                .isSuccess(false)
                .user(userA)
                .app(App.INSTAGRAM)
                .runningTime(5L)
                .date(LocalDate.now())
                .build();

        questRepository.save(questA);
        questRepository.save(questB);
        questRepository.save(questC);
    }
    @GetMapping("/username")
    public String test(@AuthenticationPrincipal User user){
        return user.getName();
    }
}
