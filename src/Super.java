public class Super {
    public static void main(String[] args) {

        //Super == Refers to the class (subclass <- superclass).
        //         Used in construction and method overriding.
        //         Calls the parent constructors to initialize attributes.


        Person person = new Person("Tom", "Riddle");
        Student students = new Student("Harry", "Potter", 3.25);

        person.showName();
        students.showName();
        System.out.println(students.gpa);

    }
}
