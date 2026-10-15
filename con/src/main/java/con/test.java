package con;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		// write CPXAC And press control+space to auto complete
		ApplicationContext ac=new  ClassPathXmlApplicationContext("config.xml");
		app2 c=(app2)ac.getBean("sig");
		System.out.println(c.getRoll_no() + c.getA().getName());
	}

}
