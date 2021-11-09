package chapter7;

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student("Poxos", "Poxosyan", 23, "098569225",
                "Java");

        System.out.println(student.getName());
        student.setName("Poxosik");
        System.out.println(student.getName());

        System.out.println(student);
    }
}
