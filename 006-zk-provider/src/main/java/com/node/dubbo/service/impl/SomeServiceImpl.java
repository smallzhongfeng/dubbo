package com.node.dubbo.service.impl;

import com.node.dubbo.model.User;
import com.node.dubbo.service.SomeService;

public class SomeServiceImpl implements SomeService {

    public String hello() {
        return "hello zk dubbo ~~";
    }

    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("cool");
        return user;
    }
}
