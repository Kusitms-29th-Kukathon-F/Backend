package com.kukathonF.backend.domain.repository;

import com.kukathonF.backend.domain.entity.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRepository extends JpaRepository<Quest, Long> {
    Quest findByAgo(int ago);
}
