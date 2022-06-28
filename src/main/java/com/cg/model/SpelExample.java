package com.cg.model;

import org.springframework.expression.Expression;  

import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser; 

public class SpelExample {

	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();  
		Expression exp = parser.parseExpression("'Hello SPEL'");  
		String message = (String) exp.getValue();  
	    System.out.println(message);  
		//OR  
		//System.out.println(parser.parseExpression("'Hello SPEL'").getValue());  
		 
	    //concat
		Expression exp1 = parser.parseExpression("'Welcome SPEL'.concat('!')");  
		String message1 = (String) exp1.getValue();  
		System.out.println(message1);  
		
		//Converting String into byte array
		Expression exp3 = parser.parseExpression("'Hello World'.bytes");  
		byte[] bytes = (byte[]) exp3.getValue();  
		for(int i=0;i<bytes.length;i++){  
		    System.out.print(bytes[i]+" ");  
		}  
		//Getting length after converting string into bytes
		Expression exp4 = parser.parseExpression("'Hello World'.bytes.length");  
		int length = (Integer) exp4.getValue();  
		System.out.println(length);  
		
		//Converting String contents into uppercase letter
		Expression exp5 = parser.parseExpression("new String('hello world').toUpperCase()");  
		String message4 = exp5.getValue(String.class);  
		System.out.println(message4);  
		//OR  
		System.out.println(parser.parseExpression("'hello world'.toUpperCase()").getValue());  
		
		
		
		
}
}
