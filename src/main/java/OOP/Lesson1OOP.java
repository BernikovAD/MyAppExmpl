package OOP;

import java.util.Scanner;

public class Lesson1OOP {

    public static void main(String[] args) {
        //String string = ("sdfsdfasdfa");

        Cat catMurzik = new Cat("Murzik",2,"Серый",3);
        Cat catVaska = new Cat("Vaska");
        Cat catKira = new Cat("Kira",3);
        Cat catMarkiz = new Cat();
/*      catMurzik.name = "Murzik";
        catMurzik.age = 2;
        catMurzik.mass = 3;
        catMurzik.color = "Серый";*/
        //метод который вернул на возраст кота x
        catMarkiz.catInfo ();
        catKira.catInfo ();
        catMurzik.catInfo ();
        catVaska.catInfo ();
        int  x = 10;
        catVaska.age = x;
        catMarkiz.age =4;

        //catMurzik.eat()
    }
}
