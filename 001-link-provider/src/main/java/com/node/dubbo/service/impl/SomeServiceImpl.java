package com.node.dubbo.service.impl;

import com.node.dubbo.service.SomeService;

public class SomeServiceImpl implements SomeService {

    public String Hello(String name) {
        return "hello " + name;
    }
}
