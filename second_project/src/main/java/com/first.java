package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("f")
public class first {
	@Value("29")
	private int id;
	@Autowired
	private second sc;
	public first() {
		// TODO Auto-generated constructor stub
	} 
	
	@Override
	public String toString() {
		return "first [id=" + id + ", sc=" + sc + "]";
	}

}
