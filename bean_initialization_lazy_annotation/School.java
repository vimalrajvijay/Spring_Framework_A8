package bean_initialization_lazy_annotation;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class School {

	@PostConstruct
	public void init() {
		System.out.println("School is created");
	}
}
