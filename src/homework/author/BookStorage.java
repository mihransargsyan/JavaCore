package homework.author;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBooksByAuthor(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public void countBooksByAuthor(String keyword) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(keyword)) {
                count += books[i].getCount();
            }
        }
        System.out.println(count);
    }

    Book changeBookAuthor(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(keyword)) {
                return books[i];
            }
        }
        return null;
    }

    Author searchAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                return books[i].getAuthor();
            }
        }
        return null;
    }

}
