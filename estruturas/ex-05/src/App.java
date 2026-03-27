public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that prints only the odd numbers between 1 and 50.
        System.out.println("Odd numbers between 1 and 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
