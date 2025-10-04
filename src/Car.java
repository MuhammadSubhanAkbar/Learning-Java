// Fixed: "interface" should be "implements" and Vehicle interface needs to be defined
public class Car {

    String make;
    String model;
    int year;
    String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        // Fixed: Better formatting without extra spaces
        return this.make + "\n" + this.model + "\n" + this.year + "\n" + this.color;
    }

    public void go() {
    }

    public static class car implements Vehicle{
        @Override
        public void go() {
            System.out.println("You drive a car");
        }
    }
}
