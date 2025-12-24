package service;

import model.Student;
import exception.InvalidAgeException;
import java.util.*;

public class StudentService implements Manageable {
    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

public void addStudent() {
    try {
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        if (age < 5)
            throw new InvalidAgeException("Age must be >= 5");

        System.out.print("Enter Roll No: ");
        String roll = sc.next();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Course: ");
        String course = sc.next();

        students.add(new Student(roll, name, age, course));
        System.out.println("Student Added Successfully!");
        
    } catch (InvalidAgeException e) {
        System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
        System.out.println("Invalid input! Please enter correct data.");
        sc.nextLine();
    }
}
    public void viewStudents() {
        for (Student s : students) {
            s.display();
            System.out.println("------------------");
        }
    }
}
