public class Static {
    public static void main(String[] args) {
        // STATIC == Makes a method belong to a class
        //           rather than any specific objects.
        //           Commonly used for utility methods or shared resources.


        Friends friend1 = new Friends("SpongeBob");
        Friends friend2 = new Friends("Akbar");
        Friends friend3 = new Friends("Patric");
        Friends friend4 = new Friends("Bob");

        Friends.showFriend();

    }
}
