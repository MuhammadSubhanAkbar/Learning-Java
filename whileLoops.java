import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args){
        // while loop = repeat some code while some condition is ture

        Scanner scanner = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game,");
            System.out.print("Press Q to quit:");
            response = scanner.next().toUpperCase();


        }

        System.out.println("You have quit the game");

        scanner.close();

    }
}
