package com.springbootapi.springbootapi.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springbootapi.springbootapi.entity.user.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity userEntity);
    
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    // get all by limit offset
    Page<UserEntity> findAllUsers(Pageable pageable);
    // get search by limit offset
    Page<UserEntity> findByUserName (String userName, Pageable pageable);
}
