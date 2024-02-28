import java.util.Random;
import java.util.Scanner;
//TASK 3

public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        Scanner scanner = new Scanner (System.in);
        boolean loop = true;

        if(scanner.hasNextInt()) {
            while(loop) {
                int number = scanner.nextInt();

                if(number < rnd_number){

                    System.out.println("your number is too low");
                }

                else if(number > rnd_number){
                    System.out.println("your number is too high");
                }

                else {
                    System.out.println("Congratulations you found the number!");
                    loop = false;

                }
            }

        } else {
            System.out.println("We want numbers");
            makeAGuess();
        }
    }


}