public class Method {
    public static void main(String[] args) {
        // methods == a block of reusable code that can be used again and again when called

        int age = 16;
        String name = "Muhammad";

        happyBirthday(name, age);
        //We can write it once and can use it anywhere, so we don't have to use it again and again
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday");
        System.out.printf("Happy Birthday dear %s\n", name);  // Changed %d to %s for String
        System.out.println("Happy Birthday to you");
        System.out.printf("You are %d years old now\n", age);  // Changed %f to %d for int, fixed spelling
    }
}