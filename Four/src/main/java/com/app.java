package com;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("app")
@Scope("prototype")
class app {
	@Value("Guarav")
	private String name;
	@Value("1")
	private int id;
	Random r = new Random();

	int num = r.nextInt(100);
	app(){
		super();
		
		System.out.println("object is created in app"+ "-> "+num);
	}
	
	public int get1() {
		return num;
	}
}
