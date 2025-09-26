public class User {

    String useName ;
    String email;
    int age;

    User ( String username) {
        this.useName = username;
        this.email = "not provided";
        this.age = 0;
    }
    User ( String username, String email) {
        this.useName = username;
        this.email = email;
        this.age = 0;
    }
    User ( String username, int age,  String email) {
        this.useName = username;
        this.email = email;
        this.age = age;
    }
}
