package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@ComponentScan(basePackages="com")
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext	ac=new AnnotationConfigApplicationContext(test.class);
		first fs=(first)ac.getBean("f");
		System.out.print(fs);
		System.out.print("THIS Is PULL");
	}

}
