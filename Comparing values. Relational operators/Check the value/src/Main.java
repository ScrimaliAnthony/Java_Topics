import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x < 10) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}