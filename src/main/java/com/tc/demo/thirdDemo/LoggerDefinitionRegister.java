package com.tc.demo.thirdDemo;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

/**
 * @author taosh
 * @create 2020-01-16 9:24
 */
public class LoggerDefinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Class beanClass = LoggerService.class;

        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanClass);

        String beanName = StringUtils.uncapitalize(beanClass.getSimpleName());

        registry.registerBeanDefinition( beanName, beanDefinition);
    }
}
