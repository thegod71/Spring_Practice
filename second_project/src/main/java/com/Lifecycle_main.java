package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lifecycle_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Lifecycle_method lf=(Lifecycle_method)ac.getBean("life");
		lf.check();
		ac.close();
	}

}
