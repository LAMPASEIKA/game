public class Knight extends Unit{
    public Knight(String name){
        super(name);
        health = 110;
        defence = 110;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
}
