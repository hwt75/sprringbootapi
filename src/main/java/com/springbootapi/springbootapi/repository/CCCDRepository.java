package com.springbootapi.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapi.springbootapi.entity.user.CCCDEntity;

public interface CCCDRepository extends JpaRepository<CCCDEntity,Long>  {
    
}
