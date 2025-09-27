public class Friends {

    static int numOfFriends;
    String name;

    Friends(String name) {
        this.name = name;
        numOfFriends ++;
    }

    static void showFriend(){
        System.out.println("You have "+ numOfFriends+" friends");
    }
}
