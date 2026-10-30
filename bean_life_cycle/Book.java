package bean_life_cycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Book {

	@PostConstruct
	public void init() {
		System.out.println("Bean is created");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean is destroyed");
	}
}
