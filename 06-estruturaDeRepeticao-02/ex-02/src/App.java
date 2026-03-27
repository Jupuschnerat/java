import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
    // Create a program to read the quantity (n) of numbers to be entered by the user
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the quantity of numbers you want to input:");
    int n = scanner.nextInt();
    
    // Save the even and odd numbers in separate arrays and display them
    int[] evenNumbers = new int[n]; // Initialize array with maximum possible size
    int[] oddNumbers = new int[n]; // Initialize array with maximum possible size
    int evenCount = 0;
    int oddCount = 0;
    for (int i = 0; i < n; i++) {
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            evenNumbers[evenCount++] = number;
        } else {
            oddNumbers[oddCount++] = number;
        }
    }
    // Show how many of the numbers entered are even, and display which ones are even
    System.out.println("You entered " + evenCount + " even numbers.");
    System.out.println("The even numbers you entered are: ");
    for (int i = 0; i < evenCount; i++) {
        System.out.print(evenNumbers[i] + " ");
    }
    System.out.println(); // Print a newline character

    // Show how many of the numbers entered are odd, and display which ones are odd
    System.out.println("You entered " + oddCount + " odd numbers.");
    System.out.println("The odd numbers you entered are: ");
    for (int i = 0; i < oddCount; i++) {
        System.out.print(oddNumbers[i] + " ");

    }
    System.out.println(); // Print a newline character
    scanner.close();
    }
}
