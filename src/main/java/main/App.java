// Jesse Mäkelä
// Tehtävä 3 23.1
//olio ohjelmointi

package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);

        Zoo zoo = new Zoo();
        System.out.println("Anna eläintarhalle nimi:");
        String elaintarha = sc.nextLine();
        zoo.zooNimi(elaintarha);


        boolean exit = false;
        while (!exit) {
            System.out.println( "1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma" );
            if (sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                    System.out.println("Mikä laji?");
                    String laji = sc.nextLine();
                    System.out.println("Anna eläimen nimi:");
                    String nimi = sc.nextLine();
                    System.out.println("Anna eläimen ikä:");
                    String a = sc.nextLine();
                    int ika = Integer.parseInt(a);

                    Animal uusiElain = new Animal(laji, nimi, ika);
                    zoo.newAnimal(uusiElain);
                    break;

                    case 2:
                    zoo.listAnimals();
                    break;
                    
                    case 3:
                    System.out.println("Kuinka monta kierrosta?");
                    String b = sc.nextLine();
                    int kierrokset = Integer.parseInt(b);
                    zoo.runAnimals(kierrokset);
                    break;

                    case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;

                    default: 
                    System.out.println("Syöte oli väärä");
                    break;
                }
            }
            else {
                System.out.println("Syöte on väärä");        
            }
        }
    }
}