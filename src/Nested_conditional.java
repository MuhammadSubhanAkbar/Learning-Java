import java.util.Scanner;

public class Nested_conditional {
    public static void main(String[] args){
        boolean isStudent ;
        boolean isSenior ;
        double price = 9.99;

        //Taking the input
        Scanner scanner = new Scanner(System.in);

        //Asking if user is a student or not
        System.out.print("Are you a student (true/False): ");
        isStudent = scanner.nextBoolean();

        //Asking is student of not
        System.out.print("Are you a senior (true/False): ");
        isSenior = scanner.nextBoolean();

        scanner.close();

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%, and student discount of 10%");
                price *= 0.7; // 30% total discount (20% + 10%)
            }else{
                System.out.println("You will get a student discount of 10%");
                price *= 0.9;
            }
        }else{
            if(isSenior){
                System.out.println("You are a senior, you will get discount of 20%");
                price *=0.8;
            } else{
                System.out.println("No discount applied ");
                price *=1;
            }
        }

        System.out.printf("The price of your ticket is: $%.2f", price);
    }
}