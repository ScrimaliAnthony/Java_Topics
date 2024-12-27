import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double g = 9.8;
        double d = scanner.nextDouble();
        double h = scanner.nextDouble();
        double p = d * g * h;

        System.out.println(p);
        scanner.close();

    }
}