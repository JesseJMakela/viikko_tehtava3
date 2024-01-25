package main;

import java.util.ArrayList;


public class Zoo {
    ArrayList<Animal> animals  = new ArrayList<>();

    private String elaintarha;

    public void zooNimi(String elaintarha){
        this.elaintarha=elaintarha;

    }

    public void newAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals(){
        System.out.println(elaintarha+" pitää sisällään seuraavat eläimet:");
        for (Animal animal : animals){
            animal.tulostaTiedot();
        }
    }
    
    
    public void runAnimals(int kierrokset) {
        for (Animal animal : animals) {
            for (int i = 0; i < kierrokset; i++) {
                animal.run();
            }
         }
    }
}