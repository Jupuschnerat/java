import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a program that receive a set (N) of numbers entered by the user
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter the quantity of numbers you want to input:");
            int n = scanner.nextInt();

            // Show the smallest value
            int smallest = Integer.MAX_VALUE;

            // Show the largest value
            int largest = Integer.MIN_VALUE;

            // Show the sum of the values entered
            int sum = 0;

            for (int i = 0; i < n; i++) {
                System.out.println("Enter a number:");
                int number = scanner.nextInt();

                sum += number;

                if (number < smallest) {
                    smallest = number;
                }

                if (number > largest) {
                    largest = number;
                }
            }

            // Show the results
            System.out.println("The smallest value is: " + smallest);
            System.out.println("The largest value is: " + largest);
            System.out.println("The sum of the values entered is: " + sum);
            System.out.println("The average of the values entered is: " + (double) sum / n);
        }
    }
}