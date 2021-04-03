package com.kinight.spring.temp;

import com.kinight.spring.app.Appconfig;
import com.kinight.spring.temp.A;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class C {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
//		System.out.println(ac.getBean(A.class));

		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
		genericBeanDefinition.setBeanClass(A.class);
		genericBeanDefinition.setScope("singleton");
		genericBeanDefinition.setAutowireMode(2);

		ac.registerBeanDefinition("xx", genericBeanDefinition);
//		ac.refresh();

		// 容器当中拿BeanDefinition == beanDefinitionMap
//		BeanDefinition xx = ac.getBeanDefinition("xx");
//		System.out.println(xx);

		// ac.getBean = 容器.map.getBean == singletonObjects.get() == map.get;
		// singletonObjects 单例池 = map
		A bean = ac.getBean(A.class);
//		A bean = (A) ac.getBean("xx");
		System.out.println(bean);

		/**
		 * spring容器:
		 * 1. 扫描
		 * 2. parse --- beanDefinition object --map<"xx", o>
		 * 3. validate
		 * 4. life---- 遍历map 得到beanDefinition 实例化
		 */

	}
}
