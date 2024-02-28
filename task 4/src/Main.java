import java.util.ArrayList;
//TASK 4
public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start Game");
        actions.add("2) Resume game");
        actions.add("3) pause game");
        actions.add("4) End game");

       // System.out.println(actions.get(2));

        GameMenu gameMenu = new GameMenu(actions);
        gameMenu.displayMenu();


    }
}