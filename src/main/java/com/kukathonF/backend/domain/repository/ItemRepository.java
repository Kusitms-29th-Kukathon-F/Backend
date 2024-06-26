package com.kukathonF.backend.domain.repository;

import com.kukathonF.backend.domain.entity.Item;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
