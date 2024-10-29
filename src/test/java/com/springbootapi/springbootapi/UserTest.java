package com.springbootapi.springbootapi;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.springbootapi.springbootapi.entity.feed.FeedEntity;
import com.springbootapi.springbootapi.entity.user.UserEntity;
import com.springbootapi.springbootapi.repository.FeedRepository;
import com.springbootapi.springbootapi.repository.UserRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FeedRepository feedRepository;

    @Test
    @Transactional
    @Rollback(false)
    void oneToManyTest(){
        UserEntity user = new UserEntity();
        FeedEntity feed = new FeedEntity();
        user.setUserEmail("test1232@gmail.com");
        user.setUserName("test");
        feed.setTitle("title 1");
        feed.setDescription("description 1");
        user.setFeedList(List.of(feed));
        feed.setUser(user);
        userRepository.save(user);
        // feedRepository.save(feed);
    }
}
