
package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int nbAnimaux;

    private Aquatiques[] aquaticAnimals;
    private int aquaticCount;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.nbAnimaux = 0;
        this.aquaticAnimals = new Aquatiques[10];
        this.aquaticCount = 0;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo, name='" + name +
                "', city='" + city +
                "', nbrCages=" + nbrCages;
    }

    public boolean isZooFull() {
        return nbAnimaux >= nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null || isZooFull()) {
            return false;
        }

        if (searchAnimal(animal) != -1) {
            return false;
        }

        animals[nbAnimaux] = animal;
        nbAnimaux++;
        return true;
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

        for (int i = indice; i < nbAnimaux - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbAnimaux - 1] = null;
        nbAnimaux--;

        return true;
    }

    public boolean addAquaticAnimal(Aquatiques aquatic) {
        if (aquatic == null || aquaticCount >= aquaticAnimals.length) {
            return false;
        }

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] == aquatic) {
                return false;
            }
        }

        aquaticAnimals[aquaticCount] = aquatic;
        aquaticCount++;
        return true;
    }

    public void displaySwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];

                if (penguin.swimmingDepth > maxDepth) {
                    maxDepth = penguin.swimmingDepth;
                }
            }
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticTypes() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }
}
