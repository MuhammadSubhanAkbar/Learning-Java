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

      /*  System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.price);
        System.out.println(car.year);
        System.out.println(car.running);*/

        System.out.println(car.running);
        car.start();
        car.stop();
        System.out.println(car.running);

    }

}
