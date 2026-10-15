package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s")
public class second {
	@Value("Gaurav")
	private String name;
	@Value("Raj")
	private String title;
	public second() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "second [name=" + name + ", title=" + title + "]";
	}
}
