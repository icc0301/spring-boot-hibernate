package com.xzm.springboothibernate.controller;

import com.xzm.springboothibernate.entity.UserEntity;
import com.xzm.springboothibernate.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    private final UserRepository userRepository; // 引入UserRepository

    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public void index(){
        // 保存一条信息
        UserEntity userEntity = new UserEntity();
        userEntity.setName("小猪迷");
        userEntity.setNickname("小猪迷弟");
        userRepository.save(userEntity);

        // 查询数据
        System.out.println(userRepository.findAll());;
    }
}
