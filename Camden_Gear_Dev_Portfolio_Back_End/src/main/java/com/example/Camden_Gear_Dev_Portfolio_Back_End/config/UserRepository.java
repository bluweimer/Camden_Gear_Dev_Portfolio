package com.example.Camden_Gear_Dev_Portfolio_Back_End.config;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
