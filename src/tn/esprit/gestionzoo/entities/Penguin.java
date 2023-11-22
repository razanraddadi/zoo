package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Food;
public class Penguin extends Aquatic {


    private float swimmingDepth;

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);

        this.swimmingDepth = swimmingDepth;
    }
    public void swim() {
           System.out.println("This aquatic animal is swimming.");
        }
    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }
    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    @Override
    public void eatMeat(Food meat) {
        System.out.println("The penguin " + getName() + " is eating " + meat);
    }

}
