package org.spring.core.xmlConfig;

import org.spring.core.beans.ExampleBean;

public class TestExampleBean {

	public static void main(String[] args) {

		
		ExampleBean bean = XmlContextUtil.getBean("exampleBean",ExampleBean.class);
		
		System.out.println(bean.getUltimateAnswer());
		System.out.println(bean.getYears());
		
		ExampleBean bean1 = XmlContextUtil.getBean("exampleBean1",ExampleBean.class);
		
		System.out.println(bean1.getUltimateAnswer());
		System.out.println(bean1.getYears());
		
		ExampleBean bean2 = XmlContextUtil.getBean("exampleBean2",ExampleBean.class);
		
		System.out.println(bean2.getUltimateAnswer());
		System.out.println(bean2.getYears());
	}

}
