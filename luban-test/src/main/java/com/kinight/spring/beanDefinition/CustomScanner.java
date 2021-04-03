package com.kinight.spring.beanDefinition;

import com.kinight.spring.app.LubanScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

public class CustomScanner extends ClassPathBeanDefinitionScanner {
	public CustomScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}


}
