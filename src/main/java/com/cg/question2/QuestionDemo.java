package com.cg.question2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cg.model.Customer;

public class QuestionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource r=new ClassPathResource("question.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    QuestionList e=(QuestionList)factory.getBean("q1");  
	    e.displayInfo();
	    
	    Question1Set e1=(Question1Set)factory.getBean("q2");
	    e1.displayInfo();
	    
	    QuestionMap q=(QuestionMap)factory.getBean("q");  
	    q.displayInfo(); 
	}

}
