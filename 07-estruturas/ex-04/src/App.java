public class App {
    public static void main(String[] args) throws Exception {
    // Write a program that receives 5 numbers and shows the largest number among them.
        int[] numbers = new int[5];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
