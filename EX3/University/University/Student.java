package University;

import java.util.List;

/**
 * Created by Avigail on 5/20/2017.
 */
public class Student {
    private String name;
    private int age;
    private int degree;
    private List<Grade> grades;

    public Student(String name, int age, int degree, List<Grade> grades) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
