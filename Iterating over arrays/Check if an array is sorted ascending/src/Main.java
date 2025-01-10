import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.print(isSorted);
    }
}
