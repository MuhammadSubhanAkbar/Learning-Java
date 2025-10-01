import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args) {
        //Nested loop = loop inside a loop
        //              Used often in Matrices and DSA (Data Structure and Algorithms)

/*        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/
        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows:");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns:");
        columns = sc.nextInt();
        System.out.print("Enter the symbol:");
        symbol = sc.next().charAt(0);

        //Creating the loop

        for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= columns; j++) {
            System.out.print(symbol + " ");
        }
        System.out.println();
        }
        sc.close();

    }
}
