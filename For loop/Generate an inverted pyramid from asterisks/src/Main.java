import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int m = n; m > 0; m--) {
            if (n != m) {
                n = m;
                System.out.println();
            }
            for (; n > 0; n--) {
                System.out.print("*");
            }
        }
    }
}