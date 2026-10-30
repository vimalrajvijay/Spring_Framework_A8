package bean_initialization_lazy_annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Lazy
public class College {

	@PostConstruct
	public void init() {
		System.out.println("College is created");
	}
}
