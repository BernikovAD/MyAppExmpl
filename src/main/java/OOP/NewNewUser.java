package OOP;

public class NewNewUser extends UserNew{
    protected int power;
    public NewNewUser(String name, int money, int level, int power) {
        super (name, money, level);
        this.power = power;
    }
}
