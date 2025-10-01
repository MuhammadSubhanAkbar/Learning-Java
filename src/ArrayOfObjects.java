public class ArrayOfObjects {
    public static void main(String[] args) {

//        Car car1 = new Car("Mustang", "Red");
//        Car car2 = new Car("Mustang", "Blue");
//        Car car3 = new Car("Mustang", "Green");
        //WE DON'T ALWAYS HAVE TO DO THIS

        Car[] cars = {
                new Car("Mustang", "Red"),
                new Car("Honda", "Blue"),
                new Car("Ford", "Red")
        };

        for (Car car : cars) {
            car.color = "black";
        }
        for (Car car : cars) {
            car.drive();
        }
    }
}
