import java.util.Scanner;
import java.util.Random;

public class numberGussingGame {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int number = random.nextInt(1,11);
        int guessNumber ;
        int attempts = 0;

        System.out.println("======GUESSING GAME=======");
        System.out.println("Guess a number between 1 and 10:");


        do {
            System.out.print("Enter a guess:");
            guessNumber = scanner.nextInt();
            attempts ++;

            if(guessNumber > number){
                System.out.println("TO HIGH TRY AGAIN");
            }else if(guessNumber < number){
                System.out.println("TO LOW TRY AGAIN");
            }else {
                System.out.println("Congratulations! You guessed it!");
                System.out.println("NUMBER OF ATTEMPTS: " + attempts);
            }
        }while(guessNumber!=number);

        scanner.close();
        System.out.println("You have won");
    }
}
