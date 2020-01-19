package com.tc.demo.secondDemo.current;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author taosh
 * @create 2020-01-15 18:15
 */
public class DefaultMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        String [] dfName = applicationContext.getBeanDefinitionNames();
        for (String name : dfName) {
            System.out.println(name);
        }
    }
}
