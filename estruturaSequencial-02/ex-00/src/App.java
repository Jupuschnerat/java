import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // João bought a microcomputer to control his daily profit.
        // Everytime he brings a weight of fishes bigger then 50 kg, 
        // he pays a fine of R$4.00 for each kilo above the limit.
        // João wants to read the weight of fishes
        System.out.println("Enter the weight of fishes in kg: ");
        double weight = scanner.nextDouble();  
        // Calculate the excess weight of fishes and the fine to be paid
        double excess = 0;
        double fine = 0;
        if (weight > 50) {
            excess = weight - 50;
            fine = excess * 4.00;
        }
        // Store the excess to the weight of fishes besides the limit
        System.out.println("Excess weight of fishes: " + excess + " kg");
        // In the variable fine, store the fine João has to pay
        System.out.println("Fine to be paid: R$ " + fine);
        // Print the data of the program with adequate messages
        System.out.println("Weight of fishes: " + weight + " kg");
        scanner.close();
    }
}
