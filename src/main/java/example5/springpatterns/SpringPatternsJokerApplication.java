package example5.springpatterns;

import example5.springpatterns.corona.model.Patient;
import example5.springpatterns.corona.services.doctors.Священник;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPatternsJokerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringPatternsJokerApplication.class, args);

        context.getBean(Священник.class).исцелять(Patient.builder().build());
    }

}
