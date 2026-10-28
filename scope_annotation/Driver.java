package scope_annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		= new AnnotationConfigApplicationContext(MyConfig.class);
		
		Student s1 = (Student)context.getBean("student");
		Student s2 = (Student)context.getBean("student");
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
