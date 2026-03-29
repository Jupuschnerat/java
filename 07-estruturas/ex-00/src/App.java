import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that asks the user for three numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of the first product:");
        double price1 = scanner.nextDouble();   
        System.out.println("Enter the price of the second product:");
        double price2 = scanner.nextDouble();
        System.out.println("Enter the price of the third product:");
        double price3 = scanner.nextDouble();
        // tell the user which product he should buy based on the lowest price, or shpw that all products have the same price
        if (price1 < price2 && price1 < price3) {
            System.out.println("You should buy the first product.");
        } else if (price2 < price1 && price2 < price3) {
            System.out.println("You should buy the second product.");
        } else if (price3 < price1 && price3 < price2) {
            System.out.println("You should buy the third product.");
        } else {
            System.out.println("All products have the same price.");
        }
    }
}
