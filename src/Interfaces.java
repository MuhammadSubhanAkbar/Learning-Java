public class Interfaces {
    public static void main(String[] args) {
        //Interfaces == A blueprint for a class that specifies a set of  abstract methods
        //              that implementation classes MUST define.
        //              Support multiple inheritance like behavior.


        Rabbit r = new Rabbit();
        Hawk h = new Hawk();
        Fish f = new Fish();

        r.flee();
        h.hunt();
        f.flee();
        f.hunt();
    }
}
