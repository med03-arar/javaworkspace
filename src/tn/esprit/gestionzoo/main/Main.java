package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("YY", "XX", 5, true);
        Animal Elephant = new Animal("S", "E", 10, true);
        Animal Snake = new Animal("Sm", "S", 10, false);

        Zoo belve = new Zoo("Tunis", "Tunis", 25);

        belve.displayZoo();

        System.out.println(belve);
        System.out.println(belve.toString());
        boolean t = belve.addAnimal(lion);

        if (t == true) {
            System.out.println("Ajouter avec succès");
        } else {
            System.out.println("L'ajout a échoué");
        }
         belve.addAnimal(Elephant);
         belve.addAnimal(Snake);
        belve.afficherAnimaux();
        int indice=belve.searchAnimal(Elephant);
        System.out.println(indice);

        Aquatiques a = new Aquatiques(
                "Poisson", "Nemo", 2, false, "océan"
        );

        Terrestrial T = new Terrestrial(
                "Félins", "Lion", 5, true, 4
        );

        Dolphin d = new Dolphin(
                "Cétacés", "Flipper", 8, true, "océan", 30.5f
        );

        Penguin p = new Penguin(
                "Oiseaux", "Pingu", 3, false, "banquise", 20.0f
        );

        System.out.println(a);
        System.out.println(T);
        System.out.println(d);
        System.out.println(p);
        a.swim();
        d.swim();
        p.swim();

    }



}