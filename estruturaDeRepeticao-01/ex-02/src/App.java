public class App {
    public static void main(String[] args) throws Exception {
    // Write, using a while loop, a program that calculates the median of N numbers entered by the user.

        int sum = 0;
        int count = 0;
        double median = 0.0;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the number of values you want to calculate the median for:");
        int n = scanner.nextInt();

        while (count < n) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            sum += number;
            count++;
        }

        if (n > 0) {
            median = (double) sum / n;
            System.out.println("The median is: " + median);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
