import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        int firstOperation = input % 2;
        System.out.println(firstOperation);
        // The second operation goes here
        int secondOperation = firstOperation * 3;
        System.out.println(secondOperation);

        scanner.close();
    }
}