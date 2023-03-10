package pl.sda.springqualifier.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.sda.newpackage.interfaces.Language;

@Controller
public class LanguageController {

    private final Language language;

    public LanguageController(@Qualifier("languages") Language language) {
        this.language = language;
    }

    public String getGreeting(){
        return language.sayGreeting();
    }
}
