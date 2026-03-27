package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add student");
            System.out.println("2. Display students");
            System.out.println("3. Remove student by email");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student telephone: ");
                    String telephone = scanner.nextLine();

                    System.out.print("Enter student email: ");
                    String email = scanner.nextLine();

                    boolean emailExists = students.stream()
                            .anyMatch(s -> s.getEmail().equalsIgnoreCase(email));

                    if (emailExists) {
                        System.out.println("A student with this email already exists.");
                    } else {
                        students.add(new Student(name, telephone, email));
                        System.out.println("Student added successfully.");
                    }
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students registered.");
                    } else {
                        System.out.println("\nList of students:");
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the email of the student to remove: ");
                    String emailToRemove = scanner.nextLine();

                    boolean removed = students.removeIf(
                            s -> s.getEmail().equalsIgnoreCase(emailToRemove)
                    );

                    if (removed) {
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("No student found with that email.");
                    }
                    break;

                case 4:
                    if (students.isEmpty()) {
                        System.out.println("You must add at least one student before exiting.");
                    } else {
                        System.out.println("Exiting program...");
                        scanner.close();
                        return;
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}