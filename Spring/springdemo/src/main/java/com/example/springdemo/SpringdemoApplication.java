package com.example.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringdemoApplication {
	public static void main(String[] args) {
		System.out.println("start...");
        Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory context = new XmlBeanFactory(resource);
		Java j = (Java) context.getBean("Java");
		j.speak();
		Sec.test();
        System.out.println("end//....");
	}
}