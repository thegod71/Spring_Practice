
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.*;

@ComponentScan(basePackages="com")
@PropertySource("app.properties")
public class test {

	public static void main(String[]args) {
		AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(test.class);
		//	ac.scan("com");
		//	ac.refresh();
		second a=(second)ac.getBean("sec",second.class);
		System .out.print(a.getName() + " " + a.getTittle() + " " + a.getid());
	}
}
