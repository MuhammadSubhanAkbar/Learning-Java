import java.util.Scanner;

public class subStrings {
    public static void main(String[] args){

        //Substring = A method used to extract a portion of string

        Scanner scanner = new Scanner(System.in);

        String email ;
        String userName;
        String domain;

        System.out.print("What is you email:");
        email = scanner.nextLine();

        if (email.contains("@")){
            userName = email.substring(0,email.indexOf("@"));
            domain = email. substring(email.indexOf("@") + 1);

            System.out.println(userName);
            System.out.println(domain);
        }else{
            System.out.println("Enter a valid email, email must contain a domain");
        }


        scanner.close();

    }
}
