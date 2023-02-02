package pl.sda.springqualifier.service;

import pl.sda.springqualifier.interfaces.PetInterface;


public class DogService implements PetInterface {
    @Override
    public String checkPet() {
        return "To jest Pan Pies";
    }
}
