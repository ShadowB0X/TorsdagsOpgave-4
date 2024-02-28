import java.util.ArrayList;

//TASK 4
public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start Game");
        actions.add("2) Resume game");
        actions.add("3) pause game");
        actions.add("4) End game");

        GameMenu gameMenu = new GameMenu(actions);

        String userChoice = gameMenu.getActions();
        int action = Integer.parseInt(userChoice);

        doActions(action);
    }

    public static void doActions(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("hvad laver du???");
                break;


        }
    }
}