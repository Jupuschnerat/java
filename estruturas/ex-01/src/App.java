import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that shows the exact day of the week based on the number that the user types (1 for Sunday, 2 for Monday, etc.)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7 to know the day of the week:");
        int dayNumber = scanner.nextInt();
        // If you type another value it should show an error message
        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Error: Please enter a number from 1 to 7.");
        } else {
            switch (dayNumber) {
                case 1:
                    System.out.println("The day of the week is Sunday.");
                    break;
                case 2:
                    System.out.println("The day of the week is Monday.");
                    break;
                case 3:
                    System.out.println("The day of the week is Tuesday.");
                    break;
                case 4:
                    System.out.println("The day of the week is Wednesday.");
                    break;
                case 5:
                    System.out.println("The day of the week is Thursday.");
                    break;
                case 6:
                    System.out.println("The day of the week is Friday.");
                    break;
                case 7:
                    System.out.println("The day of the week is Saturday.");
                    break;
            }
        }
    }
}
