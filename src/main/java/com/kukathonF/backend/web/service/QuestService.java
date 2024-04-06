package com.kukathonF.backend.web.service;

import com.kukathonF.backend.domain.entity.Quest;
import com.kukathonF.backend.domain.repository.QuestRepository;
import com.kukathonF.backend.web.dto.QuestResponse;
import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class QuestService {
    private final QuestRepository questRepository;

    @Transactional(readOnly = true)
    public List<QuestResponse> findByUserIdInWeek(Long userId) {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusWeeks(1L);
        List<Quest> findQuests = questRepository.findByUserIdAndDateIsBetween(userId, startDate, endDate);

        return QuestResponse.ofList(findQuests);
    }
}
