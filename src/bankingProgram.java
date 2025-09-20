import java.util.Scanner;

public class bankingProgram {
    static Scanner input = new Scanner(System.in);
    public  static void main(String[] args) {
        //JAVA BANKING PROGRAM

        //DECLARE VARIABLES
        Scanner input = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice ;

        //DISPLAY MENU
        while(isRunning) {
            System.out.println("******************************");
            System.out.println("Welcome to the banking program");
            System.out.println("******************************");
            System.out.println("1.Show balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("******************************");

            //GET AND PROCESS USER CHOICE
            System.out.print("Enter your choice(1-4):");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

    }
    static void showBalance(double balance) {
        System.out.printf("\n\nYour balance is: $%.2f\n\n", balance);
    }
    static double deposit() {
        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();

        if (amount < 0) {
            System.out.print("\n\nInvalid amount, amount must be positive\n\n");
            return 0;
        } else {
            return amount;
        }
    }
    static double withdraw(double balance) {
        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();

        if (amount < 0) {
            System.out.print("Invalid amount, amount must be positive\n\n");
            return 0;
        }

        if (amount > balance) {
            System.out.print("\n\nInsufficient funds! Available balance: " + balance+"\n\n");
            return 0;
        }

        return amount;
    }
}
