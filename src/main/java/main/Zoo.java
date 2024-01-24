package main;

import java.util.ArrayList;
import java.util.Scanner;


public class Zoo {
    Scanner sc = new Scanner(System.in);
    ArrayList<Animal> animals  = new ArrayList<>();

    private String elaintarha;

    public void zooNimi(){
        System.out.println("Anna eläintarhalle nimi:");
        this.elaintarha = sc.nextLine();

    }

    public void newAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals(){
        System.out.println(elaintarha+"pitää sisällään seuraavat eläimet:");
        for (Animal animal : animals){
            animal.tulostaTiedot();
        }
    }
    
    
    public void runAnimals() {
        System.out.println("Kuinka monta kierrosta?");
        int kierrokset = sc.nextInt();
        sc.nextLine();
        
        for (Animal animal : animals) {
            for (int i = 0; i < kierrokset; i++) {
                animal.run();
            }
         }
    }
}