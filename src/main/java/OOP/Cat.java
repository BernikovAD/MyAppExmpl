package OOP;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass () != obj.getClass ()) return false;
        Cat cat = (Cat) obj;
        return age == cat.age && mass == cat.mass && Objects.equals (name, cat.name) && Objects.equals (color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash (name, age, color, mass);
    }
}
