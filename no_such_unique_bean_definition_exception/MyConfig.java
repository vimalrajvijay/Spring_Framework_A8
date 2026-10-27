package no_such_unique_bean_definition_exception;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "no_such_unique_bean_definition_exception")
public class MyConfig {

}
