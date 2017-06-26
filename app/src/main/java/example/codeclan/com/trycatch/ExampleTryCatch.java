package example.codeclan.com.trycatch;

/**
 * Created by user on 26/06/2017.
 */

public class ExampleTryCatch{
    PetShop shop;

    public void run(){
        setup();
        Pet found = shop.findPetByName("Meowingtons");
        System.out.println("Found pet: " + found.getName());
    }

    public void setup(){
        shop = new PetShop();
        shop.addPet(new Dog("Rover"));
        shop.addPet(new Cat("MEOWingtons"));
        shop.addPet(new Fish("FINlay"));
    }
}
