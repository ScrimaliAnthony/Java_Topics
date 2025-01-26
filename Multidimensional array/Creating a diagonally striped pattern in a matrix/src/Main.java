import java.util.Scanner;

public class Main{

    public static void printPattern(int n) {
        char[][] array = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }
}