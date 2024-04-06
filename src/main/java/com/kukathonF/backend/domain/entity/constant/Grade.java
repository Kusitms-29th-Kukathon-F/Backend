package com.kukathonF.backend.domain.entity.constant;

import lombok.Getter;

@Getter
public enum Grade {
    COMMON("흔함"), NORMAL("보통"), RARE("희귀");

    String koreanName;

    Grade(String name) {
        this.koreanName = name;
    }
}
