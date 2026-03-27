public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that reads a list of 5 integer numbers and display them.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("You entered the following numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
    }
}
