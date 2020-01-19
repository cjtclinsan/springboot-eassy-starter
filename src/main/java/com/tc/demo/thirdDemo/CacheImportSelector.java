package com.tc.demo.thirdDemo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author taosh
 * @create 2020-01-15 18:31
 */
public class CacheImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        Map<String, Object> attrs = annotationMetadata.getAnnotationAttributes(EnableDefineService.class.getName());

        return new String[]{CacheService.class.getName()};
    }
}
