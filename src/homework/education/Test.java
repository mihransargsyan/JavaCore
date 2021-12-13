package homework.education;

import homework.education.exception.UserNotFoundException;
import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.model.User;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.storage.UserStorage;
import homework.education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Test implements Commands {

    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();
    static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {

        Lesson lesson = new Lesson("Php", "8 amis", "Narek", 50000);
        Lesson lesson1 = new Lesson("Html", "5 amis", "Karen", 40000);
        Lesson[] lessons = {lesson, lesson1};

        try {
            studentStorage.add(new Student("Mihran", "Sargsyan", "male", "mihran@mail.ru",
                    "099300600", lessons, DateUtil.stringToDate("14/12/1984")));
            studentStorage.add(new Student("Tigran", "Tigranyan", "male", "tigran@mail.ru",
                    "099333738", lessons, DateUtil.stringToDate("10/12/1989")));
            studentStorage.add(new Student("Poxos", "Poxosyan", "male", "poxos@mail.ru",
                    "099364646438", lessons, DateUtil.stringToDate("18/11/1994")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        lessonStorage.add(new Lesson("Java", "6 amis", "Karen", 35000));
        lessonStorage.add(new Lesson("JavaScript", "7 amis", "Karen", 40000));
        lessonStorage.add(new Lesson("Php", "8 amis", "Narek", 50000));
        lessonStorage.add(new Lesson("Html", "10 amis", "Petros", 45000));

        userStorage.add(new User("Mihran", "Sargsyan", "mihran@mail.ru", "123456", "admin"));
        userStorage.add(new User("Tigran", "Tigranyan", "tigran@mail.ru", "000000", "user"));
        userStorage.add(new User("Martiros", "Martirosyan", "martiros@mail.ru", "888888", "user"));

        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.err.println("Invalid command !!!");
            }
        }
    }

    private static void register() {
        System.out.println(" please input user's email ");
        String email = scanner.nextLine();
        User byEmail = null;
        try {
            byEmail = userStorage.getByEmail(email);
            System.err.println("user with " + email + " already exists");
        } catch (UserNotFoundException e) {
            System.out.println(" please input user's password ");
            String password = scanner.nextLine();
            System.out.println(" please input user's name ");
            String name = scanner.nextLine();
            System.out.println(" please input user's surname ");
            String surname = scanner.nextLine();
            System.out.println(" please input type (admin | user) ");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("admin") || type.equalsIgnoreCase("user")) {
                User user = new User(name, surname, email, password, type);
                userStorage.add(user);
                System.out.println("User was registered");
            } else {
                System.err.println("type is invalid!!");
            }
        }
    }

    private static void login() {
        System.out.println(" please input user's email ");
        String email = scanner.nextLine();
        User byEmail = null;
        try {
            byEmail = userStorage.getByEmail(email);
            System.out.println(" please input user's password ");
            String password = scanner.nextLine();
            if (byEmail.getPassword().equals(password)) {
                if (byEmail.getType().equalsIgnoreCase("admin")) {
                    adminCommands();
                } else if (byEmail.getType().equalsIgnoreCase("user")) {
                    userCommands();
                }
            } else {
                System.err.println("password is wrong!" + password);
            }
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void userCommands() {
        boolean isRun = true;
        while (isRun) {
            Commands.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.exit(0);
                    break;
                case LOG_OUT:
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
                default:
                    System.err.println("Invalid command!");
            }
        }

    }

    private static void adminCommands() {
        boolean isRun = true;
        while (isRun) {
            Commands.printAdminCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.exit(0);
                    break;
                case LOG_OUT:
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
        Student student = studentStorage.getByemail(email);
        if (student == null) {
            System.out.println("please input Student name");
            String name = scanner.nextLine();
            System.out.println("please input Student surname");
            String surname = scanner.nextLine();
            System.out.println("please input Student age");
            String age = scanner.nextLine();
            System.out.println("please input Student phone");
            String phone = scanner.nextLine();
            System.out.println("please input Student birth[12/01/2021]");
            String birth = scanner.nextLine();
            Date date = null;
            try {
                date = DateUtil.stringToDate(birth);
            } catch (ParseException e) {
                System.out.println("invalid date format");
                return;
            }
            printLessonsList();
            System.out.println("please input Student lessons  (...,...,)");
            String lessons = scanner.nextLine();
            String[] lessonName = lessons.split(",");
            Lesson[] lesson = new Lesson[lessonName.length];
            for (int i = 0; i < lessonName.length; i++) {
                if (lessonStorage.getByName(lessonName[i]) != null) {
                    lesson[i] = lessonStorage.getByName(lessonName[i]);
                }
            }
            if (lesson != null) {
                Student students = new Student(name, surname, age, email, phone, lesson, date);
                studentStorage.add(students);
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
