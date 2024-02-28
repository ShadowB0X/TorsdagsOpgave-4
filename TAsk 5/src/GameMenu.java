import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {

    private ArrayList<String> actions;

    GameMenu(ArrayList<String> actions){
        this.actions = actions;

    }
    public void displayMenu(){
        for (String print : actions){
            System.out.println(print);
        }
    }

    public String getActions (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number to choose an action");
        displayMenu();

        return sc.nextLine();

    }


}
