import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSunny = scanner.nextBoolean();
        boolean isRainy = scanner.nextBoolean();
        boolean isCold = scanner.nextBoolean();

        if (isSunny && !isRainy && !isCold) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

        scanner.close();
    }
}