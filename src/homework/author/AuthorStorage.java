package homework.author;

public class AuthorStorage {
    private Author[] array;
    private int size = 0;

    AuthorStorage() {
        array = new Author[10];
    }

    AuthorStorage(int length) {
        array = new Author[length];
    }

    public void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index: ");
            return null;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}