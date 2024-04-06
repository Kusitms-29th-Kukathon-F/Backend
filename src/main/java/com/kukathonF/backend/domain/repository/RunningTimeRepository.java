package com.kukathonF.backend.domain.repository;

import com.kukathonF.backend.domain.entity.RunningTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RunningTimeRepository extends JpaRepository<RunningTime, Long> {
}
