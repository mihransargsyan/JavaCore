package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.util.FileUtil;

import java.util.LinkedList;
import java.util.List;

public class StudentStorage {

    private List<Student> students = new LinkedList<>();

    public  void initData() {
        List<Student> studentList = FileUtil.deserialazeStudents();
        if (studentList != null) {
            students = studentList;
        }
    }

    public void add(Student student) {
        students.add(student);
        FileUtil.serialazeStudents(students);
    }


    public void print() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student getByemail(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                return student;
            }
        }
        return null;
    }

    public void printStudents(Lesson lesson) {
        for (Student student : students) {
            if (student.getLessons().contains(lesson)) {
                System.out.println(student);
            }
        }
    }

    public void deleteStudent(String email) {
        for (Student student : students) {
            if (student.getEmail().contains(email)) {
                students.remove(student);
            }
        }
        FileUtil.serialazeStudents(students);
    }

}
