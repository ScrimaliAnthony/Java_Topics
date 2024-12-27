import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt();
        scanner.nextLine();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.isEmpty()) continue;
            char x = input.charAt(0);
            if(x == 'A') {
                a++;
            } else if (x == 'B') {
                b++;
            } else if (x == 'C') {
                c++;
            } else if (x == 'D') {
                d++;
            }
        }
        System.out.print(d + " " + c + " " + b + " " + a);
    }
}