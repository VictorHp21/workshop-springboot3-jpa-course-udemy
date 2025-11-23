package com.projeto.courseSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.courseSpringBoot.entities.OrderItem;
import com.projeto.courseSpringBoot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}