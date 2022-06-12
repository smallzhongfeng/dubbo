package com.node.dubbo.service.impl;

import com.node.dubbo.model.User;
import com.node.dubbo.service.SomeService;

public class SomeServiceImpl implements SomeService {

    @Override
    public String hello() {
        return "hello dubbo ~~";
    }

    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("sacacas");
        return user;
    }
}
