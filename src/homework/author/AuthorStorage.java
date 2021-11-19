package homework.author;

public class AuthorStorage {
    private Author[] authors = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
//        for (int i = 0; i < array.length; i++) {
//            tmp[i] = array[i];
//        }
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index: ");
            return null;
        }
        return authors[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() > minAge &&
                    authors[i].getAge() < maxAge) {
                System.out.println(authors[i]);
            }
        }
    }
}
