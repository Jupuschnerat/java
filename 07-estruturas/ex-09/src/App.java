public class App {
    public static void main(String[] args) throws Exception {
        // Create a program that reads 4 grades, display them and caculate the average.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double[] grades = new double[4];
        System.out.println("Enter 4 grades:");
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextDouble();
        }
        System.out.println("You entered the following grades:");
        for (double grade : grades) {
            System.out.println(grade);
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        System.out.println("The average grade is: " + average);
        
    }
}
