package com.tc.demo.fouthDemo;

import com.tc.core.TcCore;
import com.tc.demo.thirdDemo.EnableDemoMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author taosh
 * @create 2020-01-16 10:12
 */
@SpringBootApplication
public class FouthDemoMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(EnableDemoMain.class, args);

        System.out.println(ca.getBean(TcCore.class).study());
    }
}
