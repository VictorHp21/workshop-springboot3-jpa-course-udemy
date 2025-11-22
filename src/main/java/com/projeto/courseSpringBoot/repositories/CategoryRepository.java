package com.projeto.courseSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.courseSpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}