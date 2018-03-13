package org.kunal.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 public class DrawingApp {

	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml")); 
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Tringle tringle = (Tringle) context.getBean("tringle");
		tringle.draw();
	}

}
