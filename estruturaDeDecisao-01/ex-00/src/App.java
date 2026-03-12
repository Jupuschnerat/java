import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        // Recieve the two numbers and print the bigger one
        // if the numbers are equal, print "The numbers are equal" and restart the program
        if (num1 > num2) {
            System.out.println("The bigger number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The bigger number is: " + num2);
        } else {
            System.out.println("The numbers are equal");
            main(args); // Restart the program
        }
    }
}
