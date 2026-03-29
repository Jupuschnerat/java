public class App {
    public static void main(String[] args) throws Exception {
    // Create a program that recieves two integer numbers from the userand generates the integer numbers between them.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("Integer numbers between " + num1 + " and " + num2 + ":");
        for (int i = Math.min(num1, num2) + 1; i < Math.max(num1, num2); i++) {
            System.out.println(i);
        }

    }
}
