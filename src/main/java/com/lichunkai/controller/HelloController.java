package com.lichunkai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-04-07
 * Time：12:32
 */

// 请求处理类
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Spring Boot");
        return "<h1>Hello Spring Boot</h1>";
    }
}
