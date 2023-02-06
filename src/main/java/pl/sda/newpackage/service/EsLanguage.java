package pl.sda.newpackage.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.sda.newpackage.interfaces.Language;

@Service("languages")
@Profile("ES")
public class EsLanguage implements Language {
    @Override
    public String sayGreeting() {
        return "Po hiszpansku - Hola";
    }
}
