package lec04collections;

import java.util.Objects;

public class Student {
    private String name;
    private double score;

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
