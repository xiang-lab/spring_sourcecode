package com.kinight.spring.test;

import com.kinight.spring.app.Appconfig;
import com.kinight.spring.app.E;
import com.kinight.spring.app.F;
import com.kinight.spring.app.LubanScan;
import com.kinight.spring.beanDefinition.CustomScanner;
import com.kinight.spring.beanDefinition.LubanBeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.type.filter.AnnotationTypeFilter;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
//		ac.register(Appconfig.class);
//		ac.addBeanFactoryPostProcessor(new LubanBeanFactoryPostProcessor());
//		ac.scan("com.kinight");
//		ac.refresh();

		// 自定义扫描注解
//		CustomScanner customScanner = new CustomScanner(ac);
//		customScanner.addIncludeFilter(new AnnotationTypeFilter(LubanScan.class));
//		int scan = customScanner.scan("com.kinight");
//		System.out.println(scan);

//		System.out.println(ac.getBean(E.class));
//		System.out.println(ac.getBean(E.class));

		System.out.println(ac.getBean(Appconfig.class));
	}
}
