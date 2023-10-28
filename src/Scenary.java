import java.util.Scanner;

public class Scenary {
    public static String State;
    public static int Round;

    public static void printHello(){
        System.out.println(UtilStringFor.greetings + " " + Game.name);
    }
    public static void printGoodBye(){
        System.out.println(UtilStringFor.goodBye);
    }
    public static String getTheName(){
        System.out.println(UtilStringFor.enterNamePLS);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public static void setPlayer(){
        Player Player1 = new Player(getTheName());
    }
}
