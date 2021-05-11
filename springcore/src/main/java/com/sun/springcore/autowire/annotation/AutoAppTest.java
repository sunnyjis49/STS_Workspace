package com.sun.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sun/springcore/autowire/annotation/autowireannotationconfig.xml");
		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.println(emp1);
	}

}
