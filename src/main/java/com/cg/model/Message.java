package com.cg.model;

import org.springframework.beans.factory.annotation.Required;
import javax.annotation.PreDestroy;
public class Message {
	private int messageId;
	private String message;
	@PreDestroy /*bean life cycle  using  predestory*/
	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	
	//@Required         /*using required annotation*/
	public void setMessage(String message) {
		this.message = message;
	}
	
	

	/*beanlifecycle using xml*/
	public void init() throws Exception {
		System.out.println("Bean is going through init process..");
	}
	

	public void destroy() throws Exception {
		System.out.println("Bean is going to destroy..");
	}
	
	
	public void display() {
		System.out.println(getMessageId()+"\t"+getMessage());
		
	}
  
}
