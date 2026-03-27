import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that recieves a number
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();

        // and shows the week day corresponding to that number
        // 1 - Sunday
        // 2 - Monday
        // 3 - Tuesday
        // 4 - Wednesday
        // 5 - Thursday
        // 6 - Friday
        // 7 - Saturday
        // If the number is not between 1 and 7, shows "invalid number"

        switch (number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

}
