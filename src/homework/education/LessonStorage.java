package homework.education;

import homework.author.Book;

public class LessonStorage {

    private Lesson[] lessons = new Lesson[10];
    int size = 0;

    public void add(Lesson lesson) {
        if (size == lessons.length) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, size);
        lessons = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public Lesson getByName(String lessons1) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(lessons1)) {
                return lessons[i];
            }
        }
        return null;
    }

    public void deleteName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                for (int j = i + 1; j < size; j++) {
                    lessons[j - 1] = lessons[j];
                }
            }
        }
        size--;
    }
}
