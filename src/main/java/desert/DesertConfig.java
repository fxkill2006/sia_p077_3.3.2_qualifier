package desert;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//the following 3 ways to initiate component scan are all valid
//@ComponentScan(basePackages={"dessert"})
//@ComponentScan({"dessert"})
@ComponentScan(basePackageClasses=Cake.class)
public class DesertConfig {
}
