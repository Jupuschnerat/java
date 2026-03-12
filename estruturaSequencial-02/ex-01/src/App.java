import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a program to a paint store.
        // The program should ask for the size in square meters of the area
        // to be painted.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the area to be painted (in square meters): ");
        double area = scanner.nextDouble();
        // Consider that the paint covers 1 litter for every 6 square meters
        double paintNeeded = area / 6;
        // and that the paint is sold in cans of 18 liters, which cost R$ 80.00.
        double cansNeeded = Math.ceil(paintNeeded / 18);
        double totalCostCans = cansNeeded * 80.00;
        // or in gallons of 3.6 liters, which cost R$ 25.00.
        double gallonsNeeded = Math.ceil(paintNeeded / 3.6);
        double totalCostGallons = gallonsNeeded * 25.00;
        // Inform the user of the amount of paint (in liters) to be purchased
        System.out.printf("Amount of paint needed: %.2f liters\n", paintNeeded);
        // and the respective price in both cases
        System.out.println("Total cost for cans: R$ " + totalCostCans);
        System.out.println("Total cost for gallons: R$ " + totalCostGallons);
        // add 10% of safetymargin and always round up the values, so consider the full cans.
        double paintNeededWithMargin = paintNeeded * 1.1;
        double cansNeededWithMargin = Math.ceil(paintNeededWithMargin / 18);
        double totalCostCansWithMargin = cansNeededWithMargin * 80.00;
        double gallonsNeededWithMargin = Math.ceil(paintNeededWithMargin / 3.6);
        double totalCostGallonsWithMargin = gallonsNeededWithMargin * 25.00;
        System.out.printf("Amount of paint needed with 10%% margin: %.2f liters\n", paintNeededWithMargin);
        System.out.println("Total cost for cans with 10%% margin: R$ " + totalCostCansWithMargin);
        System.out.println("Total cost for gallons with 10%% margin: R$ " + totalCostGallonsWithMargin);

        
        scanner.close();
    }
}
