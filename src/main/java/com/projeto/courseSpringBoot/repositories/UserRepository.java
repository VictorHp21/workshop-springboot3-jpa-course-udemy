package com.projeto.courseSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.courseSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}