import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please type your name ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hej " + name);

        System.out.println("Please type your age ");
        int age = sc.nextInt();
        System.out.println("Du er " + age);
        int retirement = 68;
        int result = retirement - age;
        System.out.println("dit retirement år er " + result);

    }
}