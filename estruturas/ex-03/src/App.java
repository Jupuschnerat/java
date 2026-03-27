import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Prime numbers have many applications in computer science, such as cryptography and hashing algorithms.
        // A Prime number is a natural number greater than 1 that is not divisible by any positive integer other than 1 and itself.
        // Write a program that asks for a number and checks if it is prime or not.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        // The program should output "The number is prime" if the number is prime, and "The number is not prime" if it is not.
        if (isPrime) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
        scanner.close();


    }
}
