package homework.education;

public interface UserCommands {

    String LOGIN = "1";
    String REGISTER = "2";
    String EXIT = "0";

    static void prncommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + LOGIN + " Log in");
        System.out.println("please input " + REGISTER + " Register");
    }

}
