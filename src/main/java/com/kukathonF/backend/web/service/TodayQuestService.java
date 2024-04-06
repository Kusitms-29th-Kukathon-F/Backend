package com.kukathonF.backend.web.service;

import com.kukathonF.backend.domain.entity.Quest;
import com.kukathonF.backend.domain.entity.User;
import com.kukathonF.backend.domain.repository.QuestRepository;
import com.kukathonF.backend.web.dto.TodayQuestResponse;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TodayQuestService {

    private final QuestRepository questRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public TodayQuestResponse getTodayQuest(){
        Quest quest = questRepository.findByAgo(0);
        User user = entityManager.find(User.class, 1L);
        return TodayQuestResponse.fromQuest(quest,user);
    }
}
