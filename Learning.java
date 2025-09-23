public class Learning {
    public static void main(String[] args){
        double x = 45.23;
        double y = 34.234;

//        x+=y;
//        x-=y;
//        x *=y;
//        x/= y;
//        x%=y;

        //Order of operations [P-E-M-D-A-S]

        double result = x+y*(x-y)-x+y/x+y;

        System.out.println(result);

        System.out.println(x);
    }
}
