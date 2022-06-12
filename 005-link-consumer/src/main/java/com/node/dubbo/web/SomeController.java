package com.node.dubbo.web;

import com.node.dubbo.model.User;
import com.node.dubbo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeController {
    @Autowired
    private SomeService someService;

    @RequestMapping(value = "/hello")
    public String hello(Model model) {
        String hello = someService.hello();
        model.addAttribute("hello", hello);
        return "hello";

    }

    @RequestMapping(value = "/user/detail")
    public String userDetail(Model model, Integer id) {
        User user = someService.queryUserById(id);
        model.addAttribute("user", user);
        return "userDetail";
    }
}
