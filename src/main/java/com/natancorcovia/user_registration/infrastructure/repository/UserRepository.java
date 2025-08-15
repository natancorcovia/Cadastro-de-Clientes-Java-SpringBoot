package com.natancorcovia.user_registration.infrastructure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.natancorcovia.user_registration.infrastructure.entity.User;

public interface UserRepository extends JpaRepository<User , Integer> {
    Optional<User> findByEmail(String email);
    
    @Transactional
    void deleteByEmail(String email);
}
