package com;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("app")
public class app {
@Bean
//@Primary
public myapp object1() {
	myapp a =new myapp();
	a.setId(1);
	a.setName("Gaurav");
	return a; 
}
@Bean
public myapp obj1() {
	myapp a =new myapp();
	a.setId(1);
	a.setName("object 2");
	return a; 
}
}
