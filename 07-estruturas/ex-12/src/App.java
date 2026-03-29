public class App {
    public static void main(String[] args) throws Exception {
        // João bought a microcomputer to control the daily profit of his job
        // Every time he brings a weight of fishes bigger than the stabilished by the fishing regulation, which is 50kg in São Paulo,
        // he has to pay a fine of R$4,00 per kg above the limit. 
        // João needs a program that reads the variable "weight" and calculates the fine that he has to pay, if necessary.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the weight of the fishes in kg:");
        double weight = scanner.nextDouble();
        
        // Save in the variable "excess" the excess weight 
        // and in the variable "fine" the fine that João has to pay, if the weight is smallwer than 50kg, the excess and the fine will be zero.
        double excess = 0;
        double fine = 0;
        if (weight > 50) {
            excess = weight - 50;
            fine = excess * 4;
        }
        
        // print all the data of the program with the adequate messages.
        System.out.println("Weight of the fishes: " + weight + " kg");
        System.out.println("Excess weight: " + excess + " kg");
        System.out.println("Fine to be paid: R$ " + fine);
        scanner.close();
    }

}
