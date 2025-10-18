import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        //ArrayList == A resizable array that stores objects (autoboxing).
        //             Arrays are fixed in sizes, but Array list are not.

        ArrayList<Double> list = new ArrayList<>();

        list.add(1.453);
        list.add(2.45);
        list.add(3.14);
        list.add(4.654);

        System.out.println(list );

    }
}
