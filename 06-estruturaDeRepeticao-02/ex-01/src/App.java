
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a program to read the quantity of numbers to be entered by the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of numbers you want to input:");
        int quantity = scanner.nextInt();
        int oddCount = 0;
        int[] oddNumbers = new int[quantity]; // Initialize array with maximum possible size
        int oddIndex = 0;
        // save the odd numbers in an array and display them
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            if (number % 2 != 0) {
                oddNumbers[oddIndex++] = number;
                oddCount++;
            }
        }
        // Show how many of the numbers entered are odd, and display which ones are odd
        System.out.println("You entered " + oddCount + " odd numbers.");
        System.out.println("The odd numbers you entered are: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println(); // Print a newline character
        scanner.close();
    }
}
