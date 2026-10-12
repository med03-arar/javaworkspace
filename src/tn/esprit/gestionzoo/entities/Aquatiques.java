
package tn.esprit.gestionzoo.entities;

public abstract class Aquatiques extends Animal {

    protected String habitat;

    public Aquatiques(String family, String name, int age,
                   boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", habitat='" + habitat + '\'';
    }
    public abstract void swim();

}
