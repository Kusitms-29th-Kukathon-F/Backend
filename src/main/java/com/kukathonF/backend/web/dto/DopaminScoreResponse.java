package com.kukathonF.backend.web.dto;

import lombok.Builder;

@Builder
public record DopaminScoreResponse(
        Long maxScore,
        Long minScore,
        Long avgScore
) {
    public static DopaminScoreResponse of(Long maxScore, Long minScore, Long avgScore) {
        return builder()
                .maxScore(maxScore)
                .minScore(minScore)
                .avgScore(avgScore)
                .build();
    }
}
