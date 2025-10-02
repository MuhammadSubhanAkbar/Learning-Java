public class forLoop {
    public static void main(String[] args) throws InterruptedException {

        //For loop == execute some code some amount of times

        //For increment

        int start = 10;
        for (int i = start; i >0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!!");

        //For Decrement
/*        for(int i=1; i <=10 ; i--){
            System.out.println(i);
        }*/

    }
}
