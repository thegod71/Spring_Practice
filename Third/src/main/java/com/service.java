package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ser")
public class service {
@Autowired
public myapp obj;

@Override
public String toString() {
	return "service [obj=" + obj + "]";
}


}
