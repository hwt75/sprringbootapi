package com.springbootapi.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapi.springbootapi.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
    
}
