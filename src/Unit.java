public class Unit {
    protected String name;
    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;

    public Unit(String name) {
        Game.coutOfUnits++;
        this.name = name;
    }
    protected float criticalChance = 0.1f;
    protected float parryChance = 0.1f;

    public int getHealth(){//getter
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getDefence(){//getter
        return defence;
    }
    public void setDefence(int defence){
        this.defence = defence;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public float getCriticalChance() {
        return criticalChance;
    }
    public float getParryChance() {
        return parryChance;
    }
    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }
    public void setParryChance(float parryChance) {
        this.parryChance = parryChance;
    }


    public  void attack(Unit unit){
        unit.getDamage(power);
    }
    public void getDamage(int damage){
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
    public void print(String str){
        System.out.println(str + " " + this);
    }
}
