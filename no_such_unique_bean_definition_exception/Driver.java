package no_such_unique_bean_definition_exception;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		= new AnnotationConfigApplicationContext(MyConfig.class);
		
		Bank b = (Bank)context.getBean("bank");
		System.out.println(b.getAccount());
	}
}
