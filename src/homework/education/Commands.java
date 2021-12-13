package homework.education;

public interface Commands {

    String EXIT = "0";
    String ADD_LESSON = "1";
    String ADD_STUDENT = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_STUDENTS_BY_LESSON = "4";
    String PRINT_LESSONS = "5";
    String DELETE_LESSON_BY_NAME = "6";
    String DELETE_STUDENT_BY_EMAIL = "7";
    String LOGIN = "1";
    String REGISTER = "2";
    String LOG_OUT = "9";

    static void printUserCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " ADD_LESSON");
        System.out.println("please input " + ADD_STUDENT + " ADD_STUDENT");
        System.out.println("please input " + PRINT_STUDENTS + " PRINT_STUDENTS");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " PRINT_STUDENTS_BY_LESSON");
        System.out.println("please input " + PRINT_LESSONS + " PRINT_LESSONS");
        System.out.println("please input " + LOG_OUT + " LOG_OUT ");
    }

    static void printAdminCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " ADD_LESSON");
        System.out.println("please input " + ADD_STUDENT + " ADD_STUDENT");
        System.out.println("please input " + PRINT_STUDENTS + " PRINT_STUDENTS");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " PRINT_STUDENTS_BY_LESSON");
        System.out.println("please input " + PRINT_LESSONS + " PRINT_LESSONS");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " DELETE_LESSON_BY_NAME");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " DELETE_STUDENT_BY_EMAIL");
        System.out.println("please input " + LOG_OUT + " LOG_OUT ");
    }

    static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + LOGIN + " for LOGIN");
        System.out.println("please input " + REGISTER + " for REGISTER");
    }

}
