package com.tc.demo.firstDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author taosh
 * @create 2020-01-15 17:31
 */
@Service
public class DemoClass {
    public void say(){
        System.out.println("hello , say()方法");
    }
}
