package OOP;

public class Cat {
    String name;
    int age;
    String color;
    int mass;

    public Cat(String name, int age, String color, int mass) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.mass = mass;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name){
        this.name = name;
    }

    public Cat() {
        this("кошечка",10000);
    }

    public void catInfo(){
        System.out.println ("-------------------\nИмя кота: " + name + "\nВозраст кота: " + age + "\nЦвет кота: " + color + "\nМасса кота" + mass + "\n-------------------");
    }
    void eat(int mount) {
        System.out.println ("Кошка поела и стала весить " + mass + mount);
    }

    void sound() {
        System.out.println ("мяу мяу");
    }

    void sleep(int time) {
        System.out.println ("Кошка уснула на " + time);
    }


}
