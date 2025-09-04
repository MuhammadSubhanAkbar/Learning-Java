import java.util.Scanner;

public class conditionals {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("What is you age:");
        age= scanner.nextInt();
        scanner.close();

        if (age<16){
            System.out.println("You are not an adult.");
        } else if (age ==16 || age ==17) {
            System.out.println("You are very close. But you are not an adult.");
        } else{
            System.out.println("You are an adult");
        }

    }
}
