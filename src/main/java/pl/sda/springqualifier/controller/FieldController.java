package pl.sda.springqualifier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.sda.newpackage.interfaces.Language;

@Controller
public class FieldController {

    @Autowired
    @Qualifier("languages")
    private Language language;

    public   String sayGreeting(){
        return "Pozdrowienia z pola " + language.sayGreeting();
    }

}
