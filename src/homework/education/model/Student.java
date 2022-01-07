package homework.education.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class Student implements Serializable {

    private String name;
    private String surname;
    private String age;
    private String email;
    private String phone;
    private Set<Lesson> lessons;
    private Date dateOfBirth;

    Student() {
    }

    public Student(String name, String surname, String age, String email, String phone, Set<Lesson> lessons, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.lessons = lessons;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Set<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(age, student.age) && Objects.equals(email, student.email) && Objects.equals(phone, student.phone) && Objects.equals(lessons, student.lessons) && Objects.equals(dateOfBirth, student.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, email, phone, lessons, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", lessons=" + lessons +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

}
