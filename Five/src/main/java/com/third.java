package com;

import org.springframework.stereotype.Component;

@Component("t")
public class third implements first {
@Override
public int myapp() {
	System.out.println("This is third Class");
	return 20;
}
}