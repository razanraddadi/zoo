package tn.esprit.gestionzoo.entities;

public abstract non-sealed class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


  // public void swim() {
   //     System.out.println("This aquatic animal is swimming.");
   // }

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;   }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return getName().equals(other.getName()) && habitat.equals(other.habitat);
    }
    public abstract void swim();
}
