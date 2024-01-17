package ru.mvlsoft.users.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
    static final String HELLO_STRING = "Привет World!";
    @GetMapping("hello")
    public String sayHello() {
        return HELLO_STRING;
    }
}
