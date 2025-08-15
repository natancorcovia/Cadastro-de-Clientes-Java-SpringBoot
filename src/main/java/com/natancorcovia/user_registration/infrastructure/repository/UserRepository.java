package com.natancorcovia.user_registration.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natancorcovia.user_registration.infrastructure.entity.User;

public interface UserRepository extends JpaRepository<User , Integer> {
    
}
