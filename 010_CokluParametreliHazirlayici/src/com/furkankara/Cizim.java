package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class Cizim {

	
	public static void main(String[] args) {
		
		//Resource resource = new FileSystemResource("spring.xml");
		//XmlBeanFactory context = new XmlBeanFactory(resource);
		
		//ClassPathResource classPathResource= new ClassPathResource("spring.xml");
		//BeanFactory context = new XmlBeanFactory(classPathResource);
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("spring.xml"); // new { "spring.xml"} bu sekildede diyebiliriz.
		
		Ucgen ucgen = (Ucgen) context.getBean("ucgen");
		ucgen.ciz();
		
		
		
	}

}
