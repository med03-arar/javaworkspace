
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("YY", "XX", 5, true);
        Animal elephant = new Animal("S", "E", 10, true);
        Animal snake = new Animal("Sm", "S", 10, false);

        Zoo belve = new Zoo("Tunis", "Tunis", 25);

        belve.displayZoo();

        System.out.println(belve);
        System.out.println(belve.toString());

        boolean t = belve.addAnimal(lion);

        if (t) {
            System.out.println("Ajouter avec succès");
        } else {
            System.out.println("L'ajout a échoué");
        }

        belve.addAnimal(elephant);
        belve.addAnimal(snake);

        belve.afficherAnimaux();

        int indice = belve.searchAnimal(elephant);
        System.out.println(indice);

        Terrestrial terrestrial = new Terrestrial(
                "Félins", "Lion", 5, true, 4
        );

        Dolphin dolphin = new Dolphin(
                "Cétacés", "Flipper", 8, true, "océan", 30.5f
        );

        Penguin penguin = new Penguin(
                "Oiseaux", "Pingu", 3, false, "banquise", 20.0f
        );

        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        dolphin.swim();
        penguin.swim();

        Zoo zoo = new Zoo("Belvédère", "Tunis", 25);

        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);

        zoo.displaySwim();

        System.out.println(
                "Profondeur maximale : " + zoo.maxPenguinSwimmingDepth()
        );

        zoo.displayNumberOfAquaticTypes();

        Dolphin d1 = new Dolphin(
                "Cétacés", "Flipper", 8, true, "océan", 30f
        );

        Dolphin d2 = new Dolphin(
                "Cétacés", "Flipper", 8, true, "océan", 25f
        );

        System.out.println(d1.equals(d2));
    }
}
