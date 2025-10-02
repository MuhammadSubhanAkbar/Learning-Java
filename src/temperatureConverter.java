import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        //Initialize  the variables
        float temp ;
        float newTemp;
        String unit;

        System.out.print("Enter your temperature:");
        temp = scanner.nextFloat();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F):");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp -32) *5/9 : (temp * 9/5 ) +32;

        System.out.printf(" %.1f%S°", newTemp, unit); // ° = Numlock + Alt + 0176
        scanner.close();
    }
}
