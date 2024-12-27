import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbLoop = scanner.nextInt();
        int nb;
        int result = 0;

        while (nbLoop != 0) {
            nb = scanner.nextInt();
            if (nb % 4 == 0 && nb > result) {
                result = nb;
            }
            --nbLoop;
        }
        System.out.print(result);
    }
}