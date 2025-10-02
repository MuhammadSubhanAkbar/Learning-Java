import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner= new Scanner(System.in);

        String items;
        double price;
        int quantity;
        char currency = '$';


        System.out.print("What item would you like to buy:");
        items = scanner.nextLine();

        System.out.print("What is the price for each:");
        price=scanner.nextDouble();

        System.out.print("What is you quantity:");
        quantity = scanner.nextInt();


        //Total
        double total = price * quantity;
        System.out.println("\nYour have bought "+ quantity+" "+items);
        System.out.println("Your total is :"+total+currency);

        scanner.close();

    }
}
