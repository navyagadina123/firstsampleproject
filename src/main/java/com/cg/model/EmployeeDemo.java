package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDemo {

	public static void main(String[] args) {
   ApplicationContext ctx = new ClassPathXmlApplicationContext("employee.xml");
		
		Employee employee = ctx.getBean("employee", Employee.class);
		
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());
		
		System.out.println("-----------------------------");
		PanCard pancard = employee.getPancard();
		if(pancard != null)
		System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());
		else
			System.out.println("Pancard info is not available...");
		((AbstractApplicationContext) ctx).close();
	}


	}


