package com.natancorcovia.user_registration.business;

import org.springframework.stereotype.Service;

import com.natancorcovia.user_registration.infrastructure.entity.User;
import com.natancorcovia.user_registration.infrastructure.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user){
        repository.saveAndFlush(user);
    }

    public User getUserByEmail(String email){
        return repository.findByEmail(email).orElseThrow(
            () -> new RuntimeException("Email não encontrado."));
    }

    public void  deleteUserByEmail(String email){
        repository.deleteByEmail(email);
    }

    public void updateUserById(Integer id , User user){
        User userEntity = repository.findById(id).orElseThrow(
            () -> new RuntimeException("Email não encontrado."));
        User userUpdated = User.builder()
        .email(user.getEmail() != null ? user.getEmail() : userEntity.getEmail())
        .name(user.getName() != null ? user.getName() : userEntity.getName())
        .id(userEntity.getId())
        .build();

        repository.saveAndFlush(userUpdated);
    }
}
