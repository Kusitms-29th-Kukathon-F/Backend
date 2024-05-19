package com.kukathonF.backend.web.service;

import com.kukathonF.backend.domain.entity.DopaminScore;
import com.kukathonF.backend.domain.repository.DopaminScoreRepository;
import com.kukathonF.backend.global.error.ErrorCode;
import com.kukathonF.backend.global.error.exception.EntityNotFoundException;
import com.kukathonF.backend.web.dto.DopaminScoreResponse;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DopaminScoreService {
    private final DopaminScoreRepository dopaminScoreRepository;

    public DopaminScoreResponse findDopaminScoreByUserId(Long userId) {
        List<DopaminScore> findScores = dopaminScoreRepository.findByUserId(userId);

        long maxScore = findScores.stream().mapToLong(DopaminScore::getDayScore).max()
                .orElseThrow(NoSuchElementException::new);

        long minScore = findScores.stream().mapToLong(DopaminScore::getDayScore).min()
                .orElseThrow(NoSuchElementException::new);

        long avgScore = findScores.get(0).getWeekScore();

        return DopaminScoreResponse.of(maxScore, minScore, avgScore);
    }
}
