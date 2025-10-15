public class GETTER_and_SETTER {
    public static void main(String[] args) {

        // They help provide object data and rules from accessing or modifying them.
        //GETTER = Methods that make a field READABLE.
        //SETTER = Methods tha make a field WRITABLE.

        Car car = new Car("Charger", "Yellow", 10000);

        car.setprice(500); //Through this we can change the attributes, but if we didn't make a method for
                            // an attribute we cannot change it
        car.setColor("Red");

        System.out.println(car.getmodel() + " " + car.getcolor() + " " + car.getprice());
    }
}
