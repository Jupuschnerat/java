import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a multiplication table, able to generate the multiplication of any number from 1 to 10
        // the user should inform which number two numbers they want to multiply, and the program should show the result of the multiplication of those two numbers
        // the output should be in the format: "number x 1 = result", "number x 2 = result", etc.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number to multiply (1-10):");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number to multiply (1-10):");
        int num2 = scanner.nextInt();
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            System.out.println("Error: Please enter numbers from 1 to 10.");
        } else {
            int result = num1 * num2;
            System.out.println(num1 + " x " + num2 + " = " + result);
        }

    }
}
