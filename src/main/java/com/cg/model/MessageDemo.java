package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageDemo {

	public static void main(String[] args) throws Exception {
   ApplicationContext ctx = new ClassPathXmlApplicationContext("message.xml");
		
		Message message = ctx.getBean("message", Message.class);
	
		
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		
		((AbstractApplicationContext) ctx).close();

	}

}
