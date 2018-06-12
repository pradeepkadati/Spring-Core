package org.spring.core.xmlConfig;

import org.spring.core.beans.ObjectPool;

public class TestFactoryMethod {

	public static void main(String[] args) {


		ObjectPool objPool = XmlContextUtil.getBean("objPool", ObjectPool.class);

		System.out.println(objPool.getValue());

	}

}
