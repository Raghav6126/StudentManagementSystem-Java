package main;

import service.StudentService;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            switch (ch) {
                case 1: service.addStudent(); break;
                case 2: service.viewStudents(); break;
                case 3: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
