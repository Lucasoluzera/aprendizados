package com.cursosteste;

import java.util.ArrayList;
import java.util.List;

public class CadastroAnimais {

    private final List<Animal> animais;

    public CadastroAnimais() {
        this.animais = new ArrayList<>();
    }

    public List<Animal> getAnimais() {
        return this.animais;
    }

    public void adicionar(Animal animal) {

        if(animal.getRaca() == null)
            throw new AnimalSemRacaException();

        this.animais.add(animal);
    }

    public void alterar(Animal animalAntigo, Animal animalNovo) {

        this.animais.set(this.animais.indexOf(animalAntigo), animalNovo);

    }
}
