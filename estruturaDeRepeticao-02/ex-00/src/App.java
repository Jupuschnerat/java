import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a program to read the quantity of numbers to be entered by the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of numbers you want to input:");
        int quantity = scanner.nextInt();
        int evenCount = 0;
        // save the even numbers in an array and display them
        int[] evenNumbers = new int[quantity]; // Initialize array with maximum possible size
        int evenIndex = 0;
        scanner.reset();
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                evenNumbers[evenIndex++] = number;
                evenCount++;
            }
        }
        // Show how many of the numbers entered are even, and display which ones are even
        System.out.println("You entered " + evenCount + " even numbers.");
        System.out.println("The even numbers you entered are: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println(); // Print a newline character
        scanner.close();

    }
}
