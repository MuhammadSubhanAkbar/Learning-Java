import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args){
        //Enhanced Switch = A replacement to using many else if statements
        //               (Java 14 feature)

        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("What is the day: ");
        day = scanner.nextLine().toUpperCase();
        scanner.close();

        switch(day){
            case "MONDAY" -> System.out.println("It is week day 🙄");
            case "TUESDAY" -> System.out.println("It is still week day 🙄");
            case "WEDNESDAY" -> System.out.println("It is week day 🙄");
            case "THURSDAY" -> System.out.println("It is week day 🙄");  // Fixed typo
            case "FRIDAY" -> System.out.println("It is week day 🙄");
            case "SATURDAY" -> System.out.println("It is weekend day 😂");
            case "SUNDAY" -> System.out.println("It is weekend day 😂");
            default -> System.out.println("That's not a valid day!");  // Added default case
        }
    }
}