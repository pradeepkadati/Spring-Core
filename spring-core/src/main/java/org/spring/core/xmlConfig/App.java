package org.spring.core.xmlConfig;

import org.spring.core.beans.HelloBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HelloBean helloBean = XmlContextUtil.getBean("helloBean", HelloBean.class);

        System.out.println(helloBean.hello());
    }
}
