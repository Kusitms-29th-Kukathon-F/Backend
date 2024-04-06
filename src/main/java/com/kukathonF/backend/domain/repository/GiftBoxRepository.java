package com.kukathonF.backend.domain.repository;

import com.kukathonF.backend.domain.entity.GiftBox;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GiftBoxRepository extends JpaRepository<GiftBox, Long> {
    List<GiftBox> findByUserId(Long userId);
    List<GiftBox> findByUserIdAndItemIsOpenTrue(Long userId);
    List<GiftBox> findByUserIdAndItemIsOpenFalse(Long userId);
}
