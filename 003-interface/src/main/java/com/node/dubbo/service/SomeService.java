package com.node.dubbo.service;

import com.node.dubbo.model.User;

public interface SomeService {
    String hello();

    User queryUserById(Integer id);
}