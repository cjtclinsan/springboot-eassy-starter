package com.tc.demo;

import com.tc.starter.HelloFormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taosh
 * @create 2020-01-16 13:51
 */
@RestController
public class FormatController {

    @Autowired
    HelloFormatTemplate helloFormatTemplate;

    @GetMapping("/format")
    public String format(){
        User user = new User();
        user.setAge(10);
        user.setName("lily");

        return helloFormatTemplate.doFormat(user);
    }
}
