package com.springbootapi.springbootapi.repository;

import java.util.List;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springbootapi.springbootapi.entity.user.UserEntity;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {
    // separate selecting data
    Page<UserEntity> findByUserName(String userName, Pageable pageable);

    // select ... where userName = ? and userEmail = ?;
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    // select ... where userName = ?
    // UserEntity findByUserName(String userName);

    // select ... where userName = ?1 find where user begin = 1
    List<UserEntity> findByUserNameStartingWith(String userName);

    // select ... where Id < 1
    List<UserEntity> findByIdLessThan(Long id);

    // Raw JPQL
    @Query("SELECT u FROM UserEntity u WHERE u.id = (SELECT MAX(p.id) FROM UserEntity p)")
    UserEntity findMaxIdUser();

    @Query("SELECT u FROM UserEntity u WHERE u.userName = ?1 AND u.userEmail = ?2")
    List<UserEntity> getUserByNameAndEmail(String userName, String userEmail);

    @Query("SELECT u FROM UserEntity u WHERE u.userName = :userName AND u.userEmail = :userEmail")
    List<UserEntity> getUserByNameAndEmailWithAnotherWay(@Param("userName") String userName,
            @Param("userEmail") String userEmail);

    // update delete
    @Modifying
    @Query("UPDATE UserEntity u SET u.userEmail = :userName")
    @Transactional
    int updateUserName(@Param("userName") String userName);

    // Native query
    @Query(value = "SELECT COUNT(id) FROM user", nativeQuery = true)
    long getTotalUser();
}
