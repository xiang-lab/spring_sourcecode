package com.kinight.spring.temp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;


public class LubanBeanFactoryPostProcessors implements BeanFactoryPostProcessor {

	/**
	 * 扫描完成之后
	 * parse put map之后
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanService = (GenericBeanDefinition) beanFactory.getBeanDefinition("A");
		beanService.setBeanClass(TestService.class);
	}
}
