package com.backend.backend.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.backend.Models.User;

public interface UserRepository extends JpaRepository<User,Long> {

     @Query(value = "SELECT * FROM users", nativeQuery = true)
     List<User> findAllUsers();
     
     @Query(value = "SELECT * FROM users WHERE id = ?1", nativeQuery = true)
     Optional<User> findById(Long id);

     @Query(value = "INSERT INTO users (username, email, password) VALUES (?1, ?2, ?3)", nativeQuery = true)
     void saveUser(String username, String email, String password);

}
