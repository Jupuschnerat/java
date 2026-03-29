public class App {
    public static void main(String[] args) throws Exception {
        // Create a prorgram that read a list of 10 numbers and display them on the output in reverse order.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integer numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("You entered the following numbers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
