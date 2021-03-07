package com.example.demo.jwt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@CrossOrigin 크로스 오리진 가능

@Controller
public class RestApiController {

    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "<h1>홈</h1>";
    }


    @GetMapping("/api/v1/user/test")
    @ResponseBody
    public String home2(){
        return "<h1>홈</h1>";
    }


    @GetMapping("/test")
    @ResponseBody
    public String home3(){
        return "????????";
    }
}
