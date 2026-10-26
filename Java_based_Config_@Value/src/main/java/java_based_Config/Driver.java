package java_based_Config;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.Employee;
import test.Student;

public class Driver {
	
	public static void main(String[] args) {

		ConfigurableApplicationContext context 
		= new AnnotationConfigApplicationContext(TestConfig.class);
//		System.out.println(context);
//		System.out
//		.println(Arrays.toString(context.getBeanDefinitionNames()));
		Student s = (Student)context.getBean("student");
//		Employee e = (Employee)context.getBean("employee");		
		System.out.println(s);
//		System.out.println(e);
	}
}
