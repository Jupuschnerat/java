public class App {
    public static void main(String[] args) throws Exception {
        // Write a program that reads 10 numbers and write the lesser and the greater number.
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = Integer.parseInt(System.console().readLine());
        }
        int lesser = numbers[0];
        int greater = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lesser) {
                lesser = numbers[i];
            }
            if (numbers[i] > greater) {
                greater = numbers[i];
            }
        }
        System.out.println("Lesser number: " + lesser);
        System.out.println("Greater number: " + greater);
    }

}
