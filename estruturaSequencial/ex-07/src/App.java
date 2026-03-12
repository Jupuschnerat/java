import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Salary Input
        System.out.println("Enter how much you recieve per worked hour:");
        double hourlyRate = scanner.nextDouble();
        // Hours Worked Input
        System.out.println("Enter how many hours you worked in a month:");    
        double hoursWorked = scanner.nextDouble();
        // Calculate Gross Salary
        double salary = hourlyRate * hoursWorked;
        // Print Gross Salary
        System.out.println("Your gross salary is: " + salary);     
        // Deductions
        // Income Tax (11%)
        double incomeTax = salary * 0.11;
        // Print Income Tax
        System.out.println("Income Tax (11%): " + incomeTax);
        // Social Security (8%)
        double socialSecurity = salary * 0.08;
        // Print Social Security
        System.out.println("Social Security (8%): " + socialSecurity);
        // Union Dues (5%)
        double unionDues = salary * 0.05;
        // Print Union Dues
        System.out.println("Union Dues (5%): " + unionDues);
        // Total Deductions
        double totalDeductions = incomeTax + socialSecurity + unionDues;
        // Print Total Deductions
        System.out.println("Total Deductions: " + totalDeductions);
        // Print Salary after Deductions
        double netSalary = salary - totalDeductions;
        // Print Net Salary
        System.out.println("Your net salary is: " + netSalary);
    }
}
