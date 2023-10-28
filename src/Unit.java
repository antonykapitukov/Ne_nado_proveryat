public class Unit {
    protected String name;
    protected String surname;
    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;

    protected float criticalChance = 0.1f;
    protected float parryChance = 0.1f;

    public Unit(String name) {
        this.name = name;
        Game.countOfUnits++;
    }
//    public Unit(String name, String surname) {
//        this(name);
//        this.surname = surname;
//    }

    public  void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() { // геттер - получение значения
        return  health;
    }

    public  void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDefence() { // геттер - получение значения
        return  defence;
    }

    public  void setPower(int power) {
        this.power = power;
    }

    public int getPower() { // геттер - получение значения
        return  power;
    }

    public void attak(Unit unit) {
        unit.getDamage(power);
    }

    public void getDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name=" + name +
                ", surname=" + surname +
                ", health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                ", criticalChance=" + criticalChance +
                ", parryChance=" + parryChance +
                '}';
    }

    public void print() {
        System.out.println(this);
    }

    public void print(String str) {
        System.out.println(str + " " + this);
    }
}
