import java.util.Scanner;

public class MathExersice { // Fixed a small typo in the class name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAmount; // We need this to calculate the final total
        double interestEarned; // This is what we want to show as "compound interest"
        int principalAmount;
        double annualInterestRate;
        int compoundFrequency;
        int time;

        // Asking for the principal amount
        System.out.println("What is the initial amount of money (the principal):");
        principalAmount = scanner.nextInt();

        // Asking for the annual interest rate
        System.out.println("What is the annual interest rate (as a percentage):");
        annualInterestRate = scanner.nextDouble();

        // Convert the percentage rate to a decimal (e.g., 5% -> 0.05)
        annualInterestRate = annualInterestRate / 100.0;

        // Asking user for compoundFrequency
        System.out.println("How many times per year is the interest compounded:");
        compoundFrequency = scanner.nextInt();

        // Asking user for the time the money is invested
        System.out.println("For how many years will the money be invested:");
        time = scanner.nextInt();

        // CORRECT CALCULATION:
        // 1. Calculate the base: (1 + r/n)
        double base = 1 + (annualInterestRate / compoundFrequency);
        // 2. Calculate the exponent: (n * t)
        double exponent = compoundFrequency * time;
        // 3. Calculate the total amount: P * (base ^ exponent)
        totalAmount = principalAmount * java.lang.Math.pow(base, exponent);
        // 4. Finally, calculate the interest earned: Total - Principal
        interestEarned = totalAmount - principalAmount;

        // Print the results for the user
        System.out.println("\n--- Results ---");
        System.out.printf("Initial Principal: $%,d%n", principalAmount);
        System.out.printf("Annual Interest Rate: %.2f%%%n", (annualInterestRate * 100)); // Convert back to % for display
        System.out.println("Compounded: " + compoundFrequency + " time(s) per year");
        System.out.println("Time: " + time + " year(s)");
        System.out.printf("Total Amount: $%,.2f%n", totalAmount);
        System.out.printf("Interest Earned: $%,.2f%n", interestEarned);
    }
}