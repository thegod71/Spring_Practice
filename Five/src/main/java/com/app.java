package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("app")
public class app {
	@Autowired
	private myapp my;
	private String  id;
	public app() {
		System.out.println("this is app"); 
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
