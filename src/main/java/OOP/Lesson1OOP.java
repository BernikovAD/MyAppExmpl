package OOP;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson1OOP {

    public static void main(String[] args) {
        //String string = ("sdfsdfasdfa");

/*        Cat catMurzik = new Cat("Murzik",2,"Серый",3);
        Cat catVaska = new Cat("Vaska");
        Cat catKira = new Cat("Kira",3);
        Cat catMarkiz = new Cat();
        catMurzik.name = "Murzik";
        catMurzik.age = 2;
        catMurzik.mass = 3;
        catMurzik.color = "Серый";
        //метод который вернул на возраст кота x
        catMarkiz.catInfo ();
        catKira.catInfo ();
        catMurzik.catInfo ();
        catVaska.catInfo ();
        int  x = 10;
        catVaska.age = x;
        catMarkiz.age =4;
            catMarkiz.equals (catMurzik);
        //catMurzik.eat()

Object obj = new Object ();*/

 /*       String vacancy_1 = "Developer";
        String vacancy_2 = "Ingener";
        String vacancy_3 = "Artist";
        String vacancy_4 = "Soldier";
        String vacancy_5 = "developer";
        System.out.println (Arrays.toString (vacancy_1.getBytes ()));
        int num_1 =1;
        int num_2 =2;
        int num_3 =3;
        int num_4 =4;
        boolean result;



        result =  (vacancy_1 != (vacancy_2)) && (vacancy_3 != vacancy_4);

        result =  !(vacancy_1.equals(vacancy_2)) && !(vacancy_3.equals ( vacancy_4));

        result =  vacancy_2 != vacancy_1 && vacancy_4 != vacancy_3;
        result =  vacancy_1 == vacancy_5 || vacancy_5 == vacancy_1;
        result =  vacancy_1 != vacancy_2 || vacancy_3 != vacancy_4;
        result =  vacancy_1 == vacancy_2 || vacancy_3 == vacancy_4;
        result =  vacancy_1 == vacancy_5 && vacancy_5 == vacancy_1;
        result =  vacancy_3 != vacancy_2 && vacancy_1 != vacancy_4;
        result =  vacancy_3 == vacancy_2 && vacancy_3 == vacancy_5;
        result =  vacancy_4 == vacancy_2 || vacancy_3 != vacancy_1;
        result =  vacancy_4 != vacancy_5 && vacancy_4 != vacancy_4;

        result =  num_4 != num_1 && num_3 != num_2;
        result =  num_4 >= num_1 && num_4 == num_4;
        result =  num_3 == num_1 && num_2 <= num_4;
        result =  num_2 != num_1 || num_1 <= num_2;
        result =  num_3 >= num_1 || num_4 != num_1;
        result =  num_1 >= num_1 || num_3 == num_1;
        result =  num_2 <= num_1 || num_2 != num_2;*/

        User user1 = new User ("User1",0,1);
        User user2 = new User ("User2",0,1);
        User user3 = new User ("User3",0,1);

/*        System.out.println (User.count);
        User.count = 10000;
        System.out.println (User.count);*/

/*        int i = 2;
        int j = i;
        System.out.println ("i =" +i + " j = " + j);*/
        String[] string = new String[6];
        //User[] users = {user1,user2,user3};


        //User user4 = user1;
/*        user1.getInfo ();
        user4.getInfo ();*/

        User[] users =new User[3];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        //users[3] = user4;

        equip mech = new equip ("Меч всевластия", 70000);

        //user1.setLevel ();
        user2.setLevel (10);
        user3.setLevel (3);

        user1.setMoney (1000);
        user2.setMoney (77653);
        user3.setMoney (333);
        if(user2.getMoney () >= mech.price){
            user2.setMoney (-mech.price);
            System.out.println ("Игрок " + user2.getName () + " Купил " + mech.vid  + " за " + mech.price);
            user2.setEquio (1);
        }

        user1.setMoney (199999999);
        if(user1.getMoney () >= mech.price){
            user2.setMoney (-mech.price);
            System.out.println ("Игрок " + user1.getName () + " Купил " + mech.vid  + " за " + mech.price);
            user1.setEquio (1);
        }
/*      user1.getInfo ();
        user2.getInfo ();
        user3.getInfo ();*/

        System.out.println ("Уровень игроков больше 1 ");
        for (int k = 0; k < users.length; k++) {
            if(users[k].getEquio () == 1) {
                System.out.println (" У игрока " + users[k].getName () + " есть экипировка");
            }
        }

        UserNew user5 = new UserNew ("user5",0,1);
        user5.getInfo ();
/*        for (User user : users) {
            if (user.getLevel () > 1) {
                user.getInfo ();
            }
        }*/  //Одиннаковые циклы
    }
}
