package com.backend.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.backend.Models.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
