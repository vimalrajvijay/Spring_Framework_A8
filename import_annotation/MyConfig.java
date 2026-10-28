package import_annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyConfig1.class, MyConfig2.class})
public class MyConfig {

}
