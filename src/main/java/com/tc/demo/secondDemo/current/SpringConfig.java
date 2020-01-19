package com.tc.demo.secondDemo.current;

import com.tc.demo.secondDemo.other.OtherBean;
import com.tc.demo.secondDemo.other.OtherConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author taosh
 * @create 2020-01-15 18:14
 */
@Configuration
@Import(OtherConfig.class)
public class SpringConfig {
    @Bean
    public DefaultBean defaultBean(){
        return new DefaultBean();
    }
}
