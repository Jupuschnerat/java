import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how much you receive per worked hour: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter how many hours you worked: ");
        double hoursWorked = scanner.nextDouble();

        double totalSalary = hourlyRate * hoursWorked;

        System.out.println("Your total salary is: " + totalSalary);

        scanner.close();
    }
}