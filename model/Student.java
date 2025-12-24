package model;

public class Student extends Person {

    private String rollNo;   // roll number as String
    private String course;

    // ✅ UPDATED CONSTRUCTOR
    public Student(String rollNo, String name, int age, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
