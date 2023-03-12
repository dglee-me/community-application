package kr.co.dglee.user.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {

    @GetMapping("/add")
    public String userAdd(HttpServletRequest request) {

        return "useradd";
    }
}