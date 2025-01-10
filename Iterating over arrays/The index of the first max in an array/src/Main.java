import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int index = 0;
        int arraySize = sc.nextInt();
        int array;
        for (int i = 0; i < arraySize; i++) {
            array = sc.nextInt();
            if (array > x) {
                x = array;
                index = i;
            }
        }
        System.out.print(index);
    }
}