package com.kukathonF.backend.domain.repository;

import com.kukathonF.backend.domain.entity.Quest;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRepository extends JpaRepository<Quest, Long> {
    Quest findByAgo(int ago);
    List<Quest> findByUserIdAndDateIsBetween(Long userId, LocalDate startDate, LocalDate endDate);

}
