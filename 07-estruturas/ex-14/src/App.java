public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that reads integer numbers and prints the average.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the number of integers to read:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter integer " + (i + 1) + ":");
            int x = scanner.nextInt();
            sum += x;
        }
        double average = (double) sum / n;
        System.out.println("Average: " + average);
        scanner.close();
    }
}
