import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}
