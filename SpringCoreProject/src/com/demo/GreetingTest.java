package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class GreetingTest {

	public static void main(String[] args) {
		
		Resource resource =new ClassPathResource("beans.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		Greeting obj= factory.getBean("greet", Greeting.class);
	System.out.println("Greeting Object : ");
	System.out.println("Message is :  "+ obj.getMessage());
	}

}
