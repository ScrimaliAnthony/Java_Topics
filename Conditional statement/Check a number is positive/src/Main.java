import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nb = scanner.nextInt();

        if (nb > 0) {
            System.out.print("YES");
        } else if (nb <= 0) {
            System.out.print("NO");
        }
    }
}