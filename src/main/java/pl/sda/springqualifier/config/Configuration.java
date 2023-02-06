package pl.sda.springqualifier.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import pl.sda.springqualifier.service.DogService;

@org.springframework.context.annotation.Configuration
@ImportResource("classpath:config.xml")
public class Configuration {

    @Bean
    @Profile("Pies")
    public DogService dogService() {
        return new DogService();
    }



}
