package com.tc.demo.firstDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author taosh
 * @create 2020-01-15 17:34
 */
@ComponentScan(basePackages = "com.tc.demo.firstDemo")
public class ConfigurationMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationMain.class);

        //DemoClass demoClass = (DemoClass) applicationContext.getBean("demoClass");    //DL

        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        //demoClass.say();
    }
}
