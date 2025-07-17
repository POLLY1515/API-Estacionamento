package com.poliana.demo_park_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
