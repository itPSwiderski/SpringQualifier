package pl.sda.springqualifier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.sda.newpackage.interfaces.Language;

@Controller
public class ConstructorController {
    private Language language;


    public ConstructorController(@Qualifier("enLanguage") Language language) {
        this.language = language;
    }

   public String sayGreeting(){

        return "Pozdrowienia z konstruktora " + language.sayGreeting();
    }

}
