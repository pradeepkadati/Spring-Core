package org.spring.core.xmlConfig;

import org.spring.core.beans.HelloBean;

public class TestPrototype {

	public static void main(String[] args) {
		

		System.out.println(XmlContextUtil.getBean("prototypeHelloBean", HelloBean.class));
		System.out.println(XmlContextUtil.getBean("prototypeHelloBean", HelloBean.class));
		System.out.println(XmlContextUtil.getBean("prototypeHelloBean", HelloBean.class));
		System.out.println(XmlContextUtil.getBean("prototypeHelloBean", HelloBean.class));
	}

}
