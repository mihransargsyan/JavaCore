package homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {

        AuthorStorage authorStorage = new AuthorStorage();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Մուտքագրեք հեղինակների քանակը");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("Մուտքագրեք հեղինակի անունը");
            String name = scanner.next();
            System.out.println("Մուտքագրեք հեղինակի ազգանունը");
            String surname = scanner.next();
            System.out.println("Մուտքագրեք հեղինակի էլ հասցեն");
            String email = scanner.next();
            System.out.println("Մուտքագրեք հեղինակի տարիքը");
            String age = scanner.next();
            System.out.println("Մուտքագրեք հեղինակի սեռը");
            String gender = scanner.next();

            Author author = new Author(name,surname,email,age,gender);
            authorStorage.add(author);
        }
        authorStorage.print();
        System.out.println(authorStorage.getByIndex(1));
    }
}
