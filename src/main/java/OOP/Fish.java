package OOP;

public class Fish extends Animal{

    public Fish(String name, int age) {
        super (name, age);
    }

    @Override
    public void move(){
        System.out.println (name+ " поплыла!");
    }
}
