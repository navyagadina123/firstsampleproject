package com.cg.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDemo {

	public static void main(String[] args) {
//	ApplicationContext context=new ClassPathXmlApplicationContext("customer.xml");
//     Customer factory1=(Customer) context.getBean("obj");
//         factory1.displayInfo();
		
		Resource r=new ClassPathResource("customer.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Customer e=(Customer)factory.getBean("obj");  
	    e.displayInfo();  
	    
	    Customer ee=(Customer)factory.getBean("e11");  
	    ee.displayInfo();  
	    
	}

}
