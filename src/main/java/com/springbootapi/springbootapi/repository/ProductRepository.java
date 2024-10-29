package com.springbootapi.springbootapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapi.springbootapi.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Long>{

}
