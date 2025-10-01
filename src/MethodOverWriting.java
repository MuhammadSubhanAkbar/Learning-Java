public class MethodOverWriting {
    public static void main(String[] args) {
        //MethodOverwriting == When a subclass provides it own implementation of a method tht is already
        //                     defined. Allow for code usability and give specific implementation.

        dog dog = new dog();
        cat cat = new cat();
        fish fish = new fish();

        dog.move();
        cat.move();
        fish.move();

    }
}
