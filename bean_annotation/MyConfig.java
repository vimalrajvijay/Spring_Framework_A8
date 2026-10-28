package bean_annotation;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "bean_annotation")
public class MyConfig {

	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
}
