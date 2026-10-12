package tn.esprit.gestionzoo.entities;

public class Animal {

    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;

        if (age < 0) {
            System.out.println("Erreur : l'âge ne peut pas être négatif.");
            this.age = 0;
        } else {
            this.age = age;
        }

        this.isMammal = isMammal;
    }

    public String toString() {
        return "Animal{" +
                "family='" + family +
                ", name='" + name +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}