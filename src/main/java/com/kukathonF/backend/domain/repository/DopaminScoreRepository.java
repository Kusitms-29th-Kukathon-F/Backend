package com.kukathonF.backend.domain.repository;

import com.kukathonF.backend.domain.entity.DopaminScore;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DopaminScoreRepository extends JpaRepository<DopaminScore, Long> {
    List<DopaminScore> findByUserId(Long userId);
}
