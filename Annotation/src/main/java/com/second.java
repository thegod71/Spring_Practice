package com;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component("sec")
public class second {
	@Value("${name} ")
	private String name;
	@Value("${title}")
	private String tittle;
	@Value("${id}")
	private String id;
	public second() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public String getid() {
		return id;
	}
	public String getTittle() {
		return tittle;
	}
	

}
