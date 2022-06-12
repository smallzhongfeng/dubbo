package com.node.dubbo.service.impl;

import com.node.dubbo.model.User;
import com.node.dubbo.service.SomeService;

public class newSomeServiceImpl implements SomeService {
    public String hello() {
        return "hello zk dubbo 2222~~";
    }

    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("cool 222 ");
        return user;
    }
}
