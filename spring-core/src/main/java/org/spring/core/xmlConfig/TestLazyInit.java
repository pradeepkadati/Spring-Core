package org.spring.core.xmlConfig;

import org.spring.core.beans.HelloBean;

public class TestLazyInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-- fetch lazy hello bean---");
		
        HelloBean helloBean = XmlContextUtil.getBean("lazyHelloBean", HelloBean.class);
        
        System.out.println(helloBean.hello());
        
        System.out.println("-- end fetch lazy hello bean---");
    
	}

}
