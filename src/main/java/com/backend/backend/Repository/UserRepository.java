package com.backend.backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.backend.Models.User;

public interface UserRepository extends JpaRepository<User,Long> {

     @Query(value = "SELECT * FROM users", nativeQuery = true)
     List<User> findAllUsers();

}
