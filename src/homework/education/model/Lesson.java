package homework.education.model;

import java.io.Serializable;
import java.util.Objects;

public class Lesson implements Serializable {

    private String name;
    private String duration;
    private String lecturerName;
    private int price;

    public Lesson() {
    }

    public Lesson(String name, String duration, String lecturerName, int price) {
        this.name = name;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return price == lesson.price && Objects.equals(name, lesson.name) && Objects.equals(duration, lesson.duration) && Objects.equals(lecturerName, lesson.lecturerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, lecturerName, price);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", lecturerName='" + lecturerName + '\'' +
                ", price=" + price +
                '}';
    }
}
