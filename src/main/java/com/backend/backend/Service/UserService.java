package com.backend.backend.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.backend.backend.Models.User;
import com.backend.backend.Repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }
    public void saveUser(User user) {
        userRepository.save(user);
    }

   
}
