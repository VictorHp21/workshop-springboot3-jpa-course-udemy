package com.projeto.courseSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.courseSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}