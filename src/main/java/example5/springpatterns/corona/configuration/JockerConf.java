package example5.springpatterns.corona.configuration;

import example5.springpatterns.corona.bpp.InjectListBPP;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alexey Druzik on 24.03.2021
 */
@Configuration
public class JockerConf {

    @Bean
    public InjectListBPP injectListBPP() {
        return new InjectListBPP();
    }
}
