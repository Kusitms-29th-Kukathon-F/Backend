package com.kukathonF.backend.domain.repository;

import com.kukathonF.backend.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
