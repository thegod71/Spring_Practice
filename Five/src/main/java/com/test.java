package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com")
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(test.class);
	
			app c=(app)ac.getBean("app");
			System.out.println("This is push in dev");
			
	}

}
