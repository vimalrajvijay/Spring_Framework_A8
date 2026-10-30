package bean_initialization_lazy_annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		= new AnnotationConfigApplicationContext(MyConfig.class);	
		
		College c1 = (College)context.getBean("college");
		System.out.println(c1);
	}
}
