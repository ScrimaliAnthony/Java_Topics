import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        System.out.print((x * x * x)+ (x * x) + x + 1);
    }
}