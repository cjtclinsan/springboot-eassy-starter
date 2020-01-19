package com.tc.demo.thirdDemo;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CacheImportSelector.class, LoggerDefinitionRegister.class})      //动态注册
public @interface EnableDefineService {

    Class<?>[] exclude() default {};
}
