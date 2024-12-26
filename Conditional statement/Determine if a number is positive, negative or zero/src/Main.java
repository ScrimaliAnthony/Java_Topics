import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new Scanner object for reading the input
        Scanner scanner = new Scanner(System.in);

        // Read the number N
        int N = scanner.nextInt();

        // Your code goes here
        if (N > 0) {
            System.out.print("Positive");
        } else if (N < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }

        // Important: Remember to close the scanner!
        scanner.close();
    }
}