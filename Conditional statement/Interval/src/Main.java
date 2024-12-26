import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int nb = scanner.nextInt();

        if ((nb > -15 && nb <= 12) || (nb > 14 && nb < 17) || (nb >= 19)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}