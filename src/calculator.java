import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float num_1;
        float num_2;
        String operation;
        float result = 0;

        System.out.print("What is the first number: ");
        num_1 = scanner.nextFloat();

        System.out.print("What operation you want (+, -, *, /, ^): ");
        operation = scanner.next();

        System.out.print("What is the second number: ");
        num_2 = scanner.nextFloat();
        scanner.close();

        switch(operation) {
            case "+" -> result = num_1 + num_2;
            case "-" -> result = num_1 - num_2;
            case "*" -> result = num_1 * num_2;
            case "/" -> result = num_1 / num_2;
            case "^" -> result = (float)java.lang.Math.pow(num_1, num_2);
            default -> System.out.println("Invalid Input");
        }

        System.out.printf("Result: %.2f", result);
    }
}