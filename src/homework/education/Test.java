package homework.education;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Test implements AuthorBookCommands {

    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) throws ParseException {

        studentStorage.add(new Student("Mihran", "Sargsyan", "male", "mihran@mail.ru", "099300600",
                new Lesson("Java", "6 amis", "Karen", 35000), DateUtil.stringToDate("14/12/1984")));
        studentStorage.add(new Student("Tigran", "Tigranyan", "male", "tigran@mail.ru", "099333738", new
                Lesson("Java", "6 amis", "Karen", 35000),DateUtil.stringToDate("10/12/1989")));
        studentStorage.add(new Student("Poxos", "Poxosyan", "male", "poxos@mail.ru", "099364646438", new
                Lesson("Html", "10 amis", "Petros", 45000),DateUtil.stringToDate("18/11/1994")));

        lessonStorage.add(new Lesson("Java", "6 amis", "Karen", 35000));
        lessonStorage.add(new Lesson("JavaScript", "7 amis", "Karen", 40000));
        lessonStorage.add(new Lesson("Php", "8 amis", "Narek", 50000));
        lessonStorage.add(new Lesson("Html", "10 amis", "Petros", 45000));

        boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.printCommands();
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

    private static void addStudent() throws ParseException {
        System.out.println("please input Student email");
        String email = scanner.nextLine();
        Student students = studentStorage.getByemail(email);
        if (students == null) {
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
            System.out.println("please input Student birth[12/01/2021]");
            String birth = scanner.nextLine();
            Date date = DateUtil.stringToDate(birth);
            Lesson lesson = lessonStorage.getByName(lessons);
            if (lesson != null) {
                Student student = new Student(name, surname, age, email, phone, lesson, date);
                studentStorage.add(student);
                System.out.println("Thank you, Student was added");
            } else
                System.err.println("Lesson does not exists");

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
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson == null) {
            System.out.println("please input Lesson duration");
            String duration = scanner.nextLine();
            System.out.println("please input Lesson lecturerName");
            String lecturerName = scanner.nextLine();
            System.out.println("please input Lesson price");
            int price = Integer.parseInt(scanner.nextLine());
            Lesson lessons = new Lesson(name, duration, lecturerName, price);
            lessonStorage.add(lessons);
            System.out.println("Thank you, Lessons was added");
        } else
            System.err.println(name + " the course is available");
    }

}
