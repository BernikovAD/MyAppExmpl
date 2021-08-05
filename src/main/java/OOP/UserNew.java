package OOP;

public class UserNew extends User{


    public UserNew(String name, int money, int level) {
        super (name, money, level);
    }

    public void getInfo() {
        System.out.println ("Игрок game  " + name + " Уровень " + level + " Деньги " + money);
    }
    public void run(){
        System.out.println ("Player " + name + " побежал");
    }
}
