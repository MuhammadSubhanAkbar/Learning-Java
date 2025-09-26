public class OverLoadedConstructors {
    public static void main(String[] args) {
        // OverloadedConstructors == Allow a class to have multiple constructors
        //                           with different parameters list.
        //                           They enable an object to initialize in various ways

        User user1 = new User("Akbar");
        User user2 = new User("Ali", "ali@yahoo.com");
        User user3 = new User("Abdullah", 440, "Abdullah@gmail.com");

        System.out.println(user1.useName);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.useName);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.useName);
        System.out.println(user3.email);
        System.out.println(user3.age);

    }
}
