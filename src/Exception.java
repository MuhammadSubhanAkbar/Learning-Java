import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        //Exception == An event that interrupt normal flow of the program.
        //             Following is an example

        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("Enter number:");
            int num = sc.nextInt();
            System.out.println(num);

        }
        catch(InputMismatchException e){
            System.out.println("Enter a vaid number");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot not " + e.getMessage());
        }
        catch(java.lang.Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            sc.close();
        }
    }
}
