import java.util.Scanner;

public class ternaryOperators {
    public static void main(String[] args){
        //ternary operator ? Return a value of 1 or 0 if a condition is ture

        //variable = (condition) ? isTure :isFalse

        Scanner scanner = new Scanner(System.in);

        //Initialize  the variables
        int number ;

        //Ask user for number
        System.out.print("What is the number:");
        number = scanner.nextInt();


        String evenOrOdd = (number % 2 == 0)? "Even" :"odd";

        System.out.println(evenOrOdd);

        scanner.close();
    }
}
