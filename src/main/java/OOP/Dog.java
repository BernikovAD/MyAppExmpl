package OOP;

public class Dog  extends Animal{
    public Dog(String name, int age) {
        super (name, age);
    }

    @Override
    public void voice() {
        super.voice ();
        System.out.println (name + " гав гав");
    }

    @Override
    public void move() {
        System.out.println (name + " побежала!");

    }
    public void security(){
        System.out.println (name + " охраняет");
    }

}
