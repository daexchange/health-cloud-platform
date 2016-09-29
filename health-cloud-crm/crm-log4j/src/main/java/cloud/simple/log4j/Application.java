package cloud.simple.log4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages ="com.nant")
@SpringBootApplication
public class Application  {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}