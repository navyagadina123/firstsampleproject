package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("drawing.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
