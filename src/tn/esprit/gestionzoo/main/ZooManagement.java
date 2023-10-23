package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");
        myZoo.addAquaticAnimal(new Aquatic("crevettes", "chev", 1, true, "mer"));
        myZoo.addAquaticAnimal(new Aquatic("dauphin", "dauf", 5, true, "zoo"));
        myZoo.addAquaticAnimal(new Aquatic("shark", "tigershark", 4, false, "mer"));


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        System.out.println("-------------------------------------------------------");
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Aquatic aquaticTest = new Aquatic("shark", "white", 7, true, "Sea");
        Aquatic aquatic1 = new Aquatic("Famille1", "Nom1", 5, true, "Habitat1");
        Aquatic aquatic2 = new Aquatic("Famille2", "Nom2", 3, false, "Habitat2");

        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);



        aquatic.swim();
        dolphin.swim();
        penguin.swim();
        myZoo.displayNumberOfAquaticsByType();
        //System.out.println(aquatic.equals(aquaticTest));
        boolean areEqual = aquatic1.equals(aquatic2);
        if (areEqual) {
            System.out.println("ils sont égaux.");
        } else {
            System.out.println("ils ne sont pas égaux.");
        }
        //System.out.println(aquatic.equals());

    }


}
