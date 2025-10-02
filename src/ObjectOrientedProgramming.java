public class ObjectOrientedProgramming {
    static class Car {
        String make = "Ford";
        String model = "Mustang";
        String year = "2000";
        String color = "Red";
        double price = 58000.99;
        boolean running = false;

        void start() {
            running = true;
            System.out.println("Starting Car" );
        }
        void stop() {
            running = false;
            System.out.println("Stopping Car" );
        }
    }
    public static  void main(String[] args) {
        //Object == An entity that can hold data (attributes)
        //          and can perform action (methods)
        //          it is reference data type

        Car car = new Car();

      /*  System.out.println(Car.make);
        System.out.println(Car.model);
        System.out.println(Car.color);
        System.out.println(Car.price);
        System.out.println(Car.year);
        System.out.println(Car.running);*/

        System.out.println(car.running);
        car.start();
        car.stop();
        System.out.println(car.running);

    }

}
