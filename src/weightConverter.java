import java.util.Scanner;
public class weightConverter {
    public static void main(String[] args){
        //WEIGHT CONVERSION PROGRAM

        //Declare the variables
        float Kilo;
        float pounds;
        int option;


        //Welcome message
        Scanner scanner = new Scanner(System.in);  // Fixed: Added missing semicolon
        System.out.println("=====Weight conversion from kgs to lbs and from lbs to kgs");

        //Prompt the user choice
        System.out.println("What do you want to convert?");
        System.out.print("Pick 1 for kgs to lbs and 2 for lbs to kgs:");
        option = scanner.nextInt();

        //option 1 convert kgs to lbs
        if (option == 1){
            System.out.print("What is the wight in kgs:");
            Kilo = scanner.nextFloat();  // Fixed: Store the input value
            pounds = Kilo * 2.20462f;    // Fixed: Calculate after getting input
            System.out.println(Kilo + " kgs = " + pounds + " lbs");
        }
        //option 2 convert lbs to kgs
        else if (option == 2) {          // Fixed: Added condition for option 2
            System.out.print("What is the weight in lbs:");
            pounds = scanner.nextFloat(); // Fixed: Store the input value
            Kilo = pounds / 2.20462f;     // Fixed: Calculate conversion
            System.out.println(pounds + " lbs = " + Kilo + " kgs");
        }
        //else valid input
        else {
            System.out.println("Invalid option selected.");
        }

        scanner.close();
    }
}