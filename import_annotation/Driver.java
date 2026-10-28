package import_annotation;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		= new AnnotationConfigApplicationContext(MyConfig.class);
		
//		System.out.println(
//				Arrays.toString(context.getBeanDefinitionNames()));
		
		for(String str : context.getBeanDefinitionNames())
			System.out.println(str);
		
	}
}
