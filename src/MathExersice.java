public class MathExersice {
    public static void main(String[] args){
        //print method is ues to formate something
        //%[flag][width][.precision][specific-character]

        String name = "Spongebob";
        char firstLetter= 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        //Use s for string
//        System.out.printf("Hello %s \n", name);

        //use c for char
//        System.out.printf("Your name starts with %c \n", firstLetter);

        //use d for integers
//        System.out.printf("You are %d years old\n", age);

        //use for floating/double
//        System.out.printf("Your height is %f inches tall \n", height);

        //use b for boolean
//        System.out.printf("Employed : %b \n", isEmployed);

        System.out.printf(" Hello %s \n Your name starts with %c\n You are %d years old\n Your are %f tall \n Employed: %b", name, firstLetter, age,height, isEmployed);
    }
}