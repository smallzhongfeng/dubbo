package com.node.dubbo.web;

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
        String hello = someService.Hello("World");
        model.addAttribute("hello", hello);

        return "hello";
    }
}
