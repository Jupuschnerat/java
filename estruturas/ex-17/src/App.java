public class App {
    public static void main(String[] args) throws Exception {
        // Write a program that declares an integer, inicialize it with "0"
        // increment it 1000 by 1000, printing its value each time, until it reaches 100000.
        int i = 0;
        while (i <= 100000) {
            System.out.println(i);
            i += 1000;
        }
        
    }
}
