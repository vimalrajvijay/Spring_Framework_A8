package bean_annotation;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		= new AnnotationConfigApplicationContext(MyConfig.class);
		
		//System.out.println(context.getBeanDefinitionNames());
		
		Scanner sc = (Scanner)context.getBean("getScanner");
		
		System.out.println(sc);
	}
}
