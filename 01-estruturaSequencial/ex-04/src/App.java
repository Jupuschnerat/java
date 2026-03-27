import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in meters: ");
        double meters = scanner.nextDouble();
        double centimeters = meters * 100;
        System.out.println(meters + " meters is equal to " + centimeters + " centimeters.");
    }
}
