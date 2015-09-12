package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by glenn on 9/11/2015.
 */
public class AnimalStore implements IAnimalStore {
    @Autowired
    private IAnimal animal;
    public IAnimal GetAnimal(){
        return animal;
    }
}

