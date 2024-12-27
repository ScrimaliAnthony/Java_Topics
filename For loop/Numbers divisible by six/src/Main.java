import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x % 6 == 0) {
                result = result + x;
            }
        }
        System.out.print(result);
    }
}