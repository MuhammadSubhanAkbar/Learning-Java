import java.util.Scanner;

public class RunTimePolyMorphism {
    public static void main(String[] args) {

        /*Runtime polymorphism == When a method that gets executed is decided  based on its actual type of object.*/

        Scanner sc = new Scanner(System.in);

        animal Animal;

        System.out.print("Would you like a dog or cat (1 = dog, 2 = cat):");
        int choice =  sc.nextInt();

        if (choice == 1) {
            Animal = new dog();
            Animal.speak();
        }else{
            Animal = new cat();
            Animal.speak();
        }

    }
}
