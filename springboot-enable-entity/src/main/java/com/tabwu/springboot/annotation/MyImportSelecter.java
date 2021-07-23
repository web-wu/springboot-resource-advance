package com.tabwu.springboot.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelecter implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.tabwu.springboot.entity.Goods","com.tabwu.springboot.entity.Order"};
    }
}
