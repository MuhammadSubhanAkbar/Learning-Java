// Fixed: "interface" should be "implements" and Vehicle interface needs to be defined
public class Car {

    //If we make them private we cannot use them outside of car class
    private String make;
    private String model;
    private int price;
    private int year;
    private String color;

    public Car( String model, String color,  int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getmodel(){
        return this.model;
    }

    String getcolor(){
        return this.color;
    }

    String getprice(){
        return "$" + this.price;
    }

    void setColor(String color){
        this.color = color;
    }
    void setprice(int price){
        this.price = price;
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
