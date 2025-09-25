public class constructors {
    public static void main(String[] args) {

        //Constructors == A special method to initialize objects
        //                You can pass arguments with the constructors
        //                and setup initial value


        Students student1 = new Students("Akbar", 30, 3.2);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        Students student2 = new Students("Hassan", 56, 3.0);
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);



    }
}
