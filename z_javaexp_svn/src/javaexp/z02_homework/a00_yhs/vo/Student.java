package javaexp.z02_homework.a00_yhs.vo;

public class Student {
    private String studentID;
    private String name;
    private double grade;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentID + ", Name: " + name + ", Grade: " + grade);
    }
}
