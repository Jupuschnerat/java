public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that recieves a list of 5 integer numbers from the user and store them in an array,
        // and then display the sum of the numbers, the multiplication of the numbers and the numbers themselves.        
        int[] numbers = new int[5];
        int sum = 0;
        int multiplication = 1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = Integer.parseInt(System.console().readLine());
            sum += numbers[i];
            multiplication *= numbers[i];
        }
        System.out.println("The numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }        System.out.println("\nThe sum of the numbers is: " + sum);
        System.out.println("The multiplication of the numbers is: " + multiplication);

    }
}
