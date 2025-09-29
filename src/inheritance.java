public class inheritance {
    public static void main(String[] args) {

        //Inheritance == One class inherits attributes and methods from another class.
        //                child <- Parent <- GrandParent

        dog dog = new dog();
        cat cat = new cat();
        plants plants = new plants();

        //FOR DOG
        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        dog.eat();
        dog.speak();

        //FOR CAT
        System.out.println(cat.isAlive);
        System.out.println(cat.lives);
        cat.speak();
        cat.eat();

        //FOR PLANTS
        System.out.println(plants.isAlive);
        plants.photosynthesis();
    }
}
