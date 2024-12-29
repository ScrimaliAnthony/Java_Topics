import java.util.Scanner;

public class Main {
    public static void countCharacters(String inputString) {
        System.out.print(inputString.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        countCharacters(inputString);

        scanner.close();
    }
}