package property_source_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "property_source_annotation")
@PropertySource(value = "config.properties")
public class MyConfig {

}
