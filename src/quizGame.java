import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {
        String[] questions = {
                "What is the year Pakistan get independence",
                "What part of the computer considered the brain",
                "Who is the CEO of FaceBook",
                "Who is know as father of computer",
                "What is the first programming language"
        };

        String [][] option = {
                {"1.1947", "2.1940", "3.1985", "4.1975"},
                {"1.GPU", "2.RAM", "3.TPU", "4.CPU"},
                {"1.Akbar", "2.Mark Elliot Zuckerberg", "3.Muhammad", "4.Ali"},
                {"1.Steve Jobs", "2.Alan Turing", "3.Bill Gates", "4.Charles Babbage"},
                {"1.C", "2.C++", "3.Fortran", "4.Assembly"}
        };

        int [] answers = {1,4,2,4,3};
        int score = 0;
        int guess;

        Scanner input = new Scanner(System.in);

        System.out.println("\n\n=====Welcome to my Quiz game=====\n\n");

        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);

            for(String options:option[i]){
                System.out.println(options);
            }

            System.out.print("Enter your choice: ");
            guess = input.nextInt();

            if (guess == answers[i]){
                System.out.println("\nCorrect!\n");
                score++;
            } else {
                System.out.println("\nWrong!\n");
            }
        }

        System.out.println("Your final score is: " + score + "/" + questions.length);

        input.close();
    }
}
