package OOP;

public class JobAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal ("Какоето животное",3);
        Fish fish = new Fish("рыба",2);
        Dog dog = new Dog ("собака",1);
        animal.move ();
        animal.voice ();
        dog.voice ();
        dog.move ();
        dog.security ();
        fish.move ();
        fish.voice ();
    }
}
