public class Abstraction {
    public static void main(String[] args) {

        //Abstractions == Used to define abstraction class and methods.
        //                 Abstraction is the process of hiding implementation details
        //                 and showing the essential features;
        //                 Abstraction classes CAN'T be instantiated directly.
        //                 Can contain 'abstract' methods (which  must be implementation).
        //                 Can contain 'concrete' methods (which are inheritance).

        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(5,4);
        Rectangle rectangle = new Rectangle(10, 4);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}
