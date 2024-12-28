import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                continue;
            }
            if (i % 7 == 0) {
                System.out.println(i + ": stopped");
                break;
            }
            System.out.println(i);
        }
    }
}