package com;

public class myapp {
	private String Name;
	private int Id;
	public myapp() {
		super();
	}
	public myapp(String name, int id) {
		super();
		Name = name;
		Id = id;
	}
	@Override
	public String toString() {
		return "myapp [Name=" + Name + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}	
}
