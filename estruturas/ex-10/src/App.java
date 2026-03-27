public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that reads 20 numbers and save them in a list.
        // Create three lists: one for even numbers, one for odd numbers and one for all numbers.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] allNumbers = new int[20];
        int[] evenNumbers = new int[20];
        int[] oddNumbers = new int[20];
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = scanner.nextInt();
            if (allNumbers[i] % 2 == 0) {
                evenNumbers[evenCount] = allNumbers[i];
                evenCount++;
            } else {
                oddNumbers[oddCount] = allNumbers[i];
                oddCount++;
            }
        }
        // Save the even numbers in the even list
        // Save the odd numbers in the odd list
        // Print the three lists above.
        System.out.println("All numbers:");
        for (int number : allNumbers) {
            System.out.println(number);
        }
        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.println(evenNumbers[i]);
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.println(oddNumbers[i]);
        }
    }
}
