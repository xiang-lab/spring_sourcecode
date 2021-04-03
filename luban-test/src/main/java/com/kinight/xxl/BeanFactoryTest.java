package com.kinight.xxl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-test.xml"));
		Object a = beanFactory.getBean("componentA");
		Object b = beanFactory.getBean("componentB");

		System.out.println(a);
		System.out.println(b);
	}
}
