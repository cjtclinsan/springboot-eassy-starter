package com.tc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taosh
 * @create 2020-01-15 14:46
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello, tcc";
    }
}
