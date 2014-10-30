package com.metaformsystems.integral.test.spring;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 *
 */
public class Booter {

    public static void main(String... args) {

        GenericApplicationContext context = new GenericApplicationContext();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(context);
        reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
//        PropertiesBeanDefinitionReader propReader = new PropertiesBeanDefinitionReader(ctx);
//        propReader.loadBeanDefinitions(new ClassPathResource("otherBeans.properties"));
        context.refresh();

        ClientService service = (ClientService) context.getBean("clientService");
    }
}
