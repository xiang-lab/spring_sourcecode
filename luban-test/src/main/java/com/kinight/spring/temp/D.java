package com.kinight.spring.temp;

import com.kinight.spring.app.Appconfig;
import com.kinight.spring.temp.A;
import com.kinight.spring.temp.B;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class D {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);

		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
		genericBeanDefinition.setBeanClass(A.class);
		genericBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);

		/**
		 * 1. RootBeanDefinition只作为模板, 可以设置为 rootBeanDefinition.setAbstract(true);
		 * 2. RootBeanDefinition作为真实的bd
		 */
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
		rootBeanDefinition.getPropertyValues().add("name", "xx");
		rootBeanDefinition.setBeanClass(A.class);

		ChildBeanDefinition childBeanDefinition = new ChildBeanDefinition("bs");
		childBeanDefinition.setBeanClass(B.class);

		ac.registerBeanDefinition("bs", rootBeanDefinition);
		ac.registerBeanDefinition("cl", childBeanDefinition);


	}
}
