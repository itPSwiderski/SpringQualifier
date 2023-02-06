package pl.sda.springqualifier.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.sda.newpackage.interfaces.Language;

@Controller
public class ConstructorController {
    private final Language language;


    public ConstructorController(@Qualifier("languages") Language language) {
        this.language = language;
    }

    public String sayGreeting() {

        return "Pozdrowienia z konstruktora " + language.sayGreeting();
    }

}
