package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // GET 요청에 대한 응답 엔드포인트
    @GetMapping("/api/hello") // "/api/hello" URL로 GET 요청을 처리
    public String sayHello() {
        return "Hello, World!";  // 요청에 대한 응답 반환
    }
}
