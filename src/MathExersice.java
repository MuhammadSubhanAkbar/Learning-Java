import java.util.Scanner;

public class MathExersice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;


        System.out.print("What is a:");
        a = scanner.nextDouble();

        System.out.print("What is b");
        b = scanner.nextDouble();

        double c = java.lang.Math.sqrt(java.lang.Math.pow(a, 2) + java.lang.Math.pow(b, 2) );
        System.out.println("The hypotenuse c is: " +c);

        scanner.close();
    }
}