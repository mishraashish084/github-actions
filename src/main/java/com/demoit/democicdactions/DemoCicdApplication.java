package com.demoit.democicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoCicdApplication {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to learning";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoCicdApplication.class, args);
    }

}
