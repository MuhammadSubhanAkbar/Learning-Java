public class Variable_Argument {
    public static void main(String[] args) {
        //varargs == Variable Arguments allow a method to accept # number of arguments
        //           make the method more flexible no need for overloaded methods
        //           java will pack the argument in any array
        //           ...(ellipsis)

        System.out.println(average(1,2,3,4,5,6));

        //Through we can add any number of argument
        //By this we can avoid using overloaded methods and can use 1

    }
    static double average(double... numbers) {
        double sum = 0;
        for(double number : numbers) {
            sum += number;
        }
        return sum/numbers.length;
    }
}
