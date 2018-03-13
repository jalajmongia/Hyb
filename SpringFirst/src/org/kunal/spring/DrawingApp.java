package org.kunal.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Tringle tringle = (Tringle) beanFactory.getBean("tringle");
		tringle.draw();
	}

}
