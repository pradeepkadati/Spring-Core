package org.spring.core.xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlContextUtil {

    private static final ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");

    public static <T> T getBean(String id, Class<T> clazz){
        return context.getBean(id,clazz);
    }
}
