import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        int result = 0;
        int x;

        int number;
        for (int i = 0; i < array.length; i++) {
            number = sc.nextInt();
            array[i] = number;
        }

        for (int i = 0; i <= array.length -2; i++) {
            x = array[i] * array[i + 1];
            if (x > result) {
                result = x;
            }
        }
        System.out.print(result);
    }
}