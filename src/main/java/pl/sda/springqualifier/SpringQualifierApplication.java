package pl.sda.springqualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.sda.springqualifier.controller.ConstructorController;
import pl.sda.springqualifier.controller.FieldController;
import pl.sda.springqualifier.controller.LanguageController;
import pl.sda.springqualifier.controller.SetterController;

@SpringBootApplication
@ComponentScan(basePackages = {"pl.sda.springqualifier", "pl.sda.newpackage"})
public class SpringQualifierApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringQualifierApplication.class, args);

        LanguageController languageController = (LanguageController) ctx.getBean("languageController");
        System.out.println(languageController.getGreeting());

        ConstructorController constructorController = (ConstructorController) ctx.getBean("constructorController");
        System.out.println(constructorController.sayGreeting());

        SetterController setterController = (SetterController) ctx.getBean("setterController");
        System.out.println(setterController.sayGreeting());

        FieldController fieldController = (FieldController) ctx.getBean("fieldController");
        System.out.println(fieldController.sayGreeting());
    }

}
