package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class LessonStorage {

    private List<Lesson> lessons = new ArrayList<>();

    public void initData() {
        List<Lesson> lessonList = FileUtil.deserialazeLessons();
        if (lessonList != null) {
            lessons = lessonList;
        }
    }

    public void add(Lesson lesson) {
        lessons.add(lesson);
        FileUtil.serialazeLessons(lessons);
    }

    public void print() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }
    }

    public Lesson getByName(String lessons1) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(lessons1)) {
                return lesson;
            }
        }
        return null;
    }

    public void deleteByLessonName(Lesson lesson1) {
        lessons.remove(lesson1);
        FileUtil.serialazeLessons(lessons);
    }
}
