package pl.sda.newpackage.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.sda.newpackage.interfaces.Language;

@Service
@Primary
public class EnLanguage implements Language {
    @Override
    public String sayGreeting() {
        return "Po angielsku - Hello";
    }
}
