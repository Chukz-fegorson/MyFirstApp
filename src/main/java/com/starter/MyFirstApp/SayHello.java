package com.starter.MyFirstApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHello {

    //"say-hello" => "Hello! what are you learning today?"

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! what are you learning today?";
    }
}

