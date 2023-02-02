package pl.sda.springqualifier.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import pl.sda.springqualifier.service.DogService;

@org.springframework.context.annotation.Configuration
@ImportResource("classpath:config.xml")
public class Configuration {

    @Bean
    DogService dogService(){
        return new DogService();
    }
}
