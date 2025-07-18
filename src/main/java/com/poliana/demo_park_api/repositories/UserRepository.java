package com.poliana.demo_park_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poliana.demo_park_api.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
