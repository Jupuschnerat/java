import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that recieves the price of three products
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the first product: ");
        double price1 = scanner.nextDouble();
        System.out.print("Enter the price of the second product: ");
        double price2 = scanner.nextDouble();
        System.out.print("Enter the price of the third product: ");
        double price3 = scanner.nextDouble();
        // inform the user which one he should buy.
        // Considering that the user should buy the one with the lowest price.
        // if there are two products with the same lowest price,
        // inform the user that he can choose any of them.
        // if there are three products with the same lowest price,
        // inform the user that he can choose any of them.
        if (price1 < price2 && price1 < price3) {
            System.out.println("You should buy the first product.");
        } else if (price2 < price1 && price2 < price3) {
            System.out.println("You should buy the second product.");
        } else if (price3 < price1 && price3 < price2) {
            System.out.println("You should buy the third product.");
        } else if (price1 == price2 && price1 < price3) {
            System.out.println("You can choose either the first or the second product.");
        } else if (price1 == price3 && price1 < price2) {
            System.out.println("You can choose either the first or the third product.");
        } else if (price2 == price3 && price2 < price1) {
            System.out.println("You can choose either the second or the third product.");
        } else {
            System.out.println("All products have the same price. You can choose any of them.");
        }
        
    }
}
