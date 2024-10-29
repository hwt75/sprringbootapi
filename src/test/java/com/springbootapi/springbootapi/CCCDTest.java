package com.springbootapi.springbootapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.springbootapi.springbootapi.entity.user.CCCDEntity;
import com.springbootapi.springbootapi.entity.user.UserEntity;
import com.springbootapi.springbootapi.repository.CCCDRepository;
import com.springbootapi.springbootapi.repository.UserRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
public class CCCDTest {
    @Autowired
    private CCCDRepository cccdRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    @Rollback(false)
    void oneToOneTest() {
        UserEntity user = userRepository.findMaxIdUser();
        CCCDEntity cccd = new CCCDEntity();
        cccd.setNumberCCCD("123123");
        if (user != null) {
            user.setCccd(cccd);
            userRepository.save(user);
        }
    }
}
