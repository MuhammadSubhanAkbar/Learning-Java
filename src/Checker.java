import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {

        // Variable
        String sentence;

        Scanner input = new Scanner(System.in);


            System.out.print("Please enter your sentence: ");
            sentence = input.nextLine();

            StringBuilder sb = new StringBuilder(sentence);
            String reversed = sb.reverse().toString();

            if(reversed ==  sentence){
                System.out.println("It is a palindrome");
                System.out.println(reversed);
            }else {
                System.out.println("That is not a palindrome");
                System.out.println(reversed);
            }



    }
}
