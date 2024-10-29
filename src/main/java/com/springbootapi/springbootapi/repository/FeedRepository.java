package com.springbootapi.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapi.springbootapi.entity.feed.FeedEntity;

public interface FeedRepository extends JpaRepository<FeedEntity,Long> {

    
}