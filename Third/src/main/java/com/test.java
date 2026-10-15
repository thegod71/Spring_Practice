package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages="com")
public class test {
public static void main(String []args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(test.class);
	service s=(service)ac.getBean("ser");
	System.out.print(s);
}
}  
