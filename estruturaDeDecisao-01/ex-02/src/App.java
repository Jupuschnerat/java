import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that recieve two partial grades of a student
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first grade:");
        double grade1 = scanner.nextDouble();
        System.out.println("Enter the second grade:");
        double grade2 = scanner.nextDouble();
        // the program must calculate the avarage reached by the student
        double average = (grade1 + grade2) / 2;
        // show the "you were approved" message if the avarage is equal or higher than 7.0
        // show the "you were reprovede if the avarage is lower than 7.0
        // show the "you were approved with distinction" message if the avarage is equal to 10.0
        // the program should only accept and display grades with maximum two numbers after the comma
        if (average >= 7.0 && average < 10.0) {
            System.out.printf("You were approved with an average of %.2f%n", average);
        } else if (average < 7.0) {
            System.out.printf("You were reproved with an average of %.2f%n", average);
        } else if (average == 10.0) {
            System.out.printf("You were approved with distinction with an average of %.2f%n", average);
        }
        scanner.close();
    }
}
