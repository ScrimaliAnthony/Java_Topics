import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if (H < A) {
            System.out.print("Deficiency");
        } else if (H > B) {
            System.out.print("Excess");
        } else {
            System.out.print("Normal");
        }
    }
}