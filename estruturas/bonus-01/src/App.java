public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that sum odd numbers between a range defined by the user.
        // The user defines the initial and the final number of the range
        // The program should sum all the odd numbers between the initial and the final number, including them if they are odd
        // in case the user enters an invalid range (initial number greater than final number), the program should display an error message and exit.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the initial number of the range: ");
        int initial = scanner.nextInt();
        System.out.print("Enter the final number of the range: ");
        int end = scanner.nextInt();

        if (initial > end) {
            System.out.println("Invalid range. The initial number cannot be greater than the final number.");
            scanner.close();
            return;
        }

        int sum = 0;
        for (int i = initial; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("The sum of odd numbers between " + initial + " and " + end + " is: " + sum);
        scanner.close();
    }
}
