import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Array == It is collection of values of the same datatype
        //         think of it as a variable with more than one 1 values.

        String [] fruits = {"Apple", "Oranges", "Banana", "Cherry "};

        //Through this we can change a given index inside the array
       // fruits [0] = "Pineapple";

        //We can also print the array length
        //int numOfFruits = fruits.length;
        //System.out.println(numOfFruits);

        //For giving all the values of the array we can cuse a for loop
        Arrays.sort(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
