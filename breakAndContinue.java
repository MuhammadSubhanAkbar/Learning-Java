public class breakAndContinue {
    public static void main(String[] args) {
        //Break == break out of the loop (STOP)
        //Continue == skip the current interation of the loop (SKIP)

        for (int i = 1; i <= 10; i++) {

            if (i  == 5) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
