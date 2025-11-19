package com.projeto.courseSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.courseSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}