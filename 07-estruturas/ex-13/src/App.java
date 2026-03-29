public class App {
    public static void main(String[] args) throws Exception {
        // Write a program that writes on the screen, from one to ten twice, the first using "for" and the second using "while".
        System.out.println("Using for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Using while:");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }
        
    }
}
