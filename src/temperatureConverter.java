import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        //Initialize  the variables
        float temp ;
        float newTemp;
        String Unit;

        System.out.print("Enter your temperature:");
        temp = scanner.nextFloat();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F):");
        Unit = scanner.next().toUpperCase();

        newTemp = (Unit.equals("C")) ? (temp -32) *5/9 : (temp * 9/5 ) +32;

        System.out.println(newTemp);
        scanner.close();
    }
}
