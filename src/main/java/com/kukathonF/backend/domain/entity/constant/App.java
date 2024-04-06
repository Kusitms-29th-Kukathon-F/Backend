package com.kukathonF.backend.domain.entity.constant;

import lombok.Getter;

@Getter
public enum App {
    INSTAGRAM("인스타그램"), TWITTER("X"), YOUTUBE("유튜브");

    String koreanName;

    App(String koreanName) {
        this.koreanName = koreanName;
    }
}
