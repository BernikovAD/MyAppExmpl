package OOP;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice(){
        System.out.println (name + " что то сказало!");
    }
    public void move(){
        System.out.println (name + " побежало!");
    }

    public Animal() {
        super ();
    }

    @Override
    public int hashCode() {
        return super.hashCode ();
    }

    @Override
    public String toString() {
        return super.toString ();
    }
}
