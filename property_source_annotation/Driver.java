package property_source_annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		= new AnnotationConfigApplicationContext(MyConfig.class);
		
		Student s = (Student)context.getBean("student");
		
		System.out.println(s);
	}
}
