package com.node.dubbo.web;

import com.node.dubbo.model.User;
import com.node.dubbo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class someController {
    @Autowired
    private SomeService someService;

    @Autowired
    private SomeService newSomeService;

    @RequestMapping("/hello")
    public String sayHello(Model model) {
        String hello = someService.hello();
        model.addAttribute("hello", hello);

        String hello1 = newSomeService.hello();
        model.addAttribute("cool2", hello1);
        return "hello";
    }

    @RequestMapping("/userDetail")
    public String user(Model model, Integer id){
        User user = someService.queryUserById(id);
        model.addAttribute("user", user);
        return "userDetail";

    }
}
