import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // The managers of your company decided to give your collaborators a raise.
        // They asked you to write a program that calculates the reajusts.
        // The program should ask the user their current salary
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your current salary: ");
        double currentSalary = scanner.nextDouble();
        
        // The reajusts follows the criteria below:
        // Salary up to R$280.00 (including): increase of 20%
        // Salary between R$280.00 and R$700.00: increase of 15%
        // Salary between R$700.00 and R$1500.00: increase of 10%
        // Salary above R$1500.00: increase of 5%
        double increasePercentage;
        if (currentSalary <= 280.00) {
            increasePercentage = 0.20;
        } else if (currentSalary <= 700.00) {
            increasePercentage = 0.15;
        } else if (currentSalary <= 1500.00) {
            increasePercentage = 0.10;
        } else {
            increasePercentage = 0.05;
        }
        // After the increase is calculated, the program should show:
        // The salary before the reajust
        // The percentage of increase applied
        // The value of the increase
        // The new salary, after the increase
        double increaseValue = currentSalary * increasePercentage;
        double newSalary = currentSalary + increaseValue;

        System.out.println("Current Salary: " + currentSalary);
        System.out.println("Increase Percentage: " + increasePercentage * 100 + "%");
        System.out.println("Increase Value: " + increaseValue);
        System.out.println("New Salary: " + newSalary);

        scanner.close();


    }
}
