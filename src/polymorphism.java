import javax.swing.*;

public class polymorphism {
    public static void main(String[] args) {
        
        //Polymorphism == POLY means 'Many', and MORPHISM means 'shapes'.
        //                It is general programming concept in which objects can identify as other objects.
        //                Object can be treated as objects of a common superclass.


        Car car = new Car( "Ford", "Mustang", 2025);
        Bike bike = new Bike();
        Boat boat = new Boat();


        Vehicle[] vehicle = { bike, boat};

        for (Vehicle v : vehicle) {
            v.go();
        }
        car.go();
//        System.out.println(car.toString());
//        bike.go();
//        boat.go();
        
    }
}
