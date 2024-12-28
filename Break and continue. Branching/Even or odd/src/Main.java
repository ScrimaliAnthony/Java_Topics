import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;

        while (true) {
            nb = scanner.nextInt();
            if (nb == 0) {
                break;
            } else if (nb % 2 == 0) {
                System.out.println("even");
                continue;
            } else {
                System.out.println("odd");
                continue;
            }
        }
    }
}