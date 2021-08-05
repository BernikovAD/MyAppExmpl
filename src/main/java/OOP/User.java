package OOP;

public class User {

    String name;
    protected int money;
    protected int moneyNew;
    protected int equio;

    public int getEquio() {
        return equio;
    }

    public void setEquio(int equio) {
        this.equio = equio;
    }

    static int count = 999;

    public String getName() {
        return name;
    }

    public void moneyplus() {
        moneyNew = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    protected int level;

    public User(String name, int money, int level) {
        this.name = name;
        this.money = money;
        this.level = level;
    }

    public void setLevel() {
        level++;
    }

    public void setLevel(int count) {
        level += count;
    }

    public void setMoney(int count) {
        money = money + count;
    }

    public int getMoney() {
        return money;
    }

    public void getInfo() {
        System.out.println ("Игрок " + name + " Уровень " + level + " Деньги " + money);
    }

}
