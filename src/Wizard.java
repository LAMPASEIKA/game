public class Wizard extends Unit{

    private int mana = 100;


    public Wizard(String name) {
        super(name);
        health = 80;
        power = 25;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }

    @Override
    public void attack(Unit unit) {
        if (mana >= 10){
            super.attack(unit);
            mana -= 10;
        }
    }
}
