import java.lang.Math;
import java.util.Scanner;

public class MathExersice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user about is it a circle or a sphere
        System.out.print("Sphere / Circle: ");
        String ask = scanner.nextLine().toLowerCase(); // Convert to lowercase for easier comparison

        // Initializing the variables
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("What is the radius: ");
        radius = scanner.nextDouble();

        if (ask.equals("circle")) {
            circumference = 2 * Math.PI * radius;
            area = Math.PI * Math.pow(radius, 2);

            System.out.printf("The circumference of the circle is: %.1f cm%n", circumference);
            System.out.printf("The area of the circle is: %.1f cm²%n", area);

        } else if (ask.equals("sphere")) {
            circumference = 2 * Math.PI * radius;
            double surfaceArea = 4 * Math.PI * Math.pow(radius, 2); // Added surface area
            volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

            System.out.printf("The circumference of the sphere is: %.1f cm%n", circumference);
            System.out.printf("The surface area of the sphere is: %.1f cm²%n", surfaceArea);
            System.out.printf("The volume of the sphere is: %.1f cm³%n", volume);

        } else {
            System.out.println("Invalid input! Please enter either 'circle' or 'sphere'.");
        }

        scanner.close();
    }
}