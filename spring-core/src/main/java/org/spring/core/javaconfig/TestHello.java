package org.spring.core.javaconfig;

import org.spring.core.beans.HelloBean;
import org.spring.core.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestHello {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		   
		HelloBean helloWorld = ctx.getBean("helloBean",HelloBean.class);
		   
		System.out.println(helloWorld.hello());  
		System.out.println( ctx.getBean("helloBean",HelloBean.class));
		System.out.println( ctx.getBean("helloBean1",HelloBean.class));


		
	}

}
