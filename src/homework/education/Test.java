package homework.education;

import java.util.Scanner;

public class Test {

    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " ADD_LESSON");
        System.out.println("please input " + ADD_STUDENT + " ADD_STUDENT");
        System.out.println("please input " + PRINT_STUDENTS + " PRINT_STUDENTS");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " PRINT_STUDENTS_BY_LESSON");
        System.out.println("please input " + PRINT_LESSONS + " PRINT_LESSONS");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " DELETE_LESSON_BY_NAME");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " DELETE_STUDENT_BY_EMAIL");
    }


    public static void main(String[] args) {

        studentStorage.add(new Student("Mihran", "Sargsyan", "male", "mihran@mail.ru", "099300600", new
                Lesson("Java", "6 amis", "Karen", 35000)));
        studentStorage.add(new Student("Tigran", "Tigranyan", "male", "tigran@mail.ru", "099333738", new
                Lesson("Java", "6 amis", "Karen", 35000)));
        studentStorage.add(new Student("Poxos", "Poxosyan", "male", "poxos@mail.ru", "099364646438", new
                Lesson("Html", "10 amis", "Petros", 45000)));

        lessonStorage.add(new Lesson("Java", "6 amis", "Karen", 35000));
        lessonStorage.add(new Lesson("JavaScript", "7 amis", "Karen", 40000));
        lessonStorage.add(new Lesson("Php", "8 amis", "Narek", 50000));
        lessonStorage.add(new Lesson("Html", "10 amis", "Petros", 45000));

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudent();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    printLessons();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.err.println("Invalid command!");
            }
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("please input student email ");
        printStudentList();
        String email = scanner.nextLine();
        Student student = studentStorage.getByemail(email);
        if (student != null) {
            studentStorage.deleteStudent(email);
        } else
            System.err.println("There are no Student email");
    }

    private static void printStudentList() {
        System.out.println("--------");
        printStudent();
        System.out.println("--------");
    }

    private static void deleteLessonByName() {
        System.out.println("please input Lesson name");
        printLessonsList();
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.deleteName(name);
        } else
            System.err.println("There are no Lesson");
    }

    private static void printLessons() {
        lessonStorage.print();
    }

    private static void printStudentsByLesson() {
        System.out.println("please input Lesson name");
        printLessonsList();
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            studentStorage.printStudents(lesson);
        } else
            System.err.println("There are no students");
    }

    private static void printStudent() {
        studentStorage.print();
    }

    private static void addStudent() {
        System.out.println("please input Student email");
        String email = scanner.nextLine();
        Student student1 = studentStorage.getByemail(email);
        if (student1 == null) {
            System.out.println("please input Student name");
            String name = scanner.nextLine();
            System.out.println("please input Student surname");
            String surname = scanner.nextLine();
            System.out.println("please input Student age");
            String age = scanner.nextLine();
            System.out.println("please input Student phone");
            String phone = scanner.nextLine();
            printLessonsList();
            System.out.println("please input Student lesson");
            String lessons = scanner.nextLine();
            Lesson lesson = lessonStorage.getByName(lessons);
            Student student = new Student(name, surname, age, email, phone, lesson);
            studentStorage.add(student);
            System.out.println("Thank you, Student was added");
        } else
            System.err.println(email + "  the student is available");
    }

    private static void printLessonsList() {
        System.out.println("--------");
        lessonStorage.print();
        System.out.println("--------");
    }

    private static void addLesson() {
        System.out.println("please input Lesson  name ");
        String name = scanner.nextLine();
        Lesson lesson1 = lessonStorage.getByName(name);
        if (lesson1 == null) {
            System.out.println("please input Lesson duration");
            String duration = scanner.nextLine();
            System.out.println("please input Lesson lecturerName");
            String lecturerName = scanner.nextLine();
            System.out.println("please input Lesson price");
            int price = Integer.parseInt(scanner.nextLine());
            Lesson lesson = new Lesson(name, duration, lecturerName, price);
            lessonStorage.add(lesson);
            System.out.println("Thank you, Lessons was added");
        } else
            System.err.println(name + " the course is available");
    }

}
