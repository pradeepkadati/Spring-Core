package org.spring.core.xmlConfig;

import org.spring.core.beans.HelloBean;

public class TestSingleton {

	public static void main(String[] args) {
		

		System.out.println(XmlContextUtil.getBean("helloBean", HelloBean.class));
		System.out.println(XmlContextUtil.getBean("helloBean", HelloBean.class));
		System.out.println(XmlContextUtil.getBean("helloBean", HelloBean.class));
		System.out.println(XmlContextUtil.getBean("helloBean", HelloBean.class));
	}

}
