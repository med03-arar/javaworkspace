package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int nbAnimaux;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.nbAnimaux = 0;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public String toString() {
        return "Zoo, name='" + name +
                "', city='" + city +
                "', nbrCages=" + nbrCages;
    }
    public boolean isZooFull(){
        if (nbAnimaux >= nbrCages) {
            return true;
        }
        return false;
    }
    public boolean addAnimal(Animal animal) {

        // Vérifier si le zoo est plein
        if (isZooFull()) {
            return false;
        }
        // Vrifier sianimal existe deja
        if (searchAnimal(animal) != -1) {
            return false;
        }
        // Vrifier si le zoo est plein
        //if (nbAnimaux >= nbrCages) {
          //  return false;
        //}
        if (nbAnimaux < nbrCages) {
            animals[nbAnimaux] = animal;
            nbAnimaux++;
            return true;
        }

        return false;
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimaux; i++) {
            if (animals[i] == animal) {
                return i;
            }
        }

        return -1;
    }
    public void afficherAnimaux() {
        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println(animals[i]);
        }
    }
    public boolean removeAnimal(Animal animal) {

        int indice = searchAnimal(animal);

        if (indice == -1) {
            return false;
        }

        Animal[] nouveauTableau = new Animal[animals.length];

        int j = 0;

        for (int i = 0; i < nbAnimaux; i++) {

            if (i != indice) {
                nouveauTableau[j] = animals[i];
                j++;
            }
        }

        animals = nouveauTableau;
        nbAnimaux--;

        return true;
    }
}