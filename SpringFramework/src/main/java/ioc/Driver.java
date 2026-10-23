package ioc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("bean_config.xml");
		//System.out.println(context);
		Student s = (Student)context.getBean("student");
		Mobile m = (Mobile)context.getBean("mobile");
		
		//s.setMobile(m);
		
		System.out.println(s);
		System.out.println(m);
	}
}
