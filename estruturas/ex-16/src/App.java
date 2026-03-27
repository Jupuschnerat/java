public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that reads "n" positive integer numbers from the user and calculates the sum of those numbers.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of positive integers you want to sum: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();
            if (num > 0) {
                sum += num;
            } else {
                System.out.println("Please enter a positive integer.");
                i--; // Decrement i to repeat this iteration
            }
        }
        System.out.println("The sum of the positive integers is: " + sum);
        scanner.close();
    }
}
