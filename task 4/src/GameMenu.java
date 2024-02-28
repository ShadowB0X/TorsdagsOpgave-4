import java.util.ArrayList;

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

}
