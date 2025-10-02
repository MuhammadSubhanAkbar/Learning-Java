import java.util.Random;

public class Java {
    public static void main(String[] args){
        Random random = new Random();
        // Numbers
        int number1 = random.nextInt(1, 101);
        int number2 = random.nextInt(1,101);
        int number3 = random.nextInt(1,101);
        int number4 = random.nextInt(1,101);
        int number5 = random.nextInt(1,101);

        //Random doubles
        double num1 = random.nextDouble(0,1);
        double num2 = random.nextDouble(1,2);
        double num3 = random.nextDouble(2,3);

        //Random boolean
        boolean First = random.nextBoolean();
        boolean second = random.nextBoolean();

        System.out.println(number1 +"\n" + number2 + "\n" + number3 + "\n" + number4 + "\n" + number5 );
        System.out.println(num1 +"\n" + num2 + "\n" + num3 );
        System.out.println(First +"\n"+ second);
    }
}