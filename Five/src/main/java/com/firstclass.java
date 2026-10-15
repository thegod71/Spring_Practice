package com;

import org.springframework.stereotype.Component;

@Component("f")
public class firstclass implements first {
@Override
public int myapp() {
	System.out.println("This is first Class");
	return 10;
}
}
