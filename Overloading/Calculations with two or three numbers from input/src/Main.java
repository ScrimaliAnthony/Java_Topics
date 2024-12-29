import java.util.*;

public class Main {
    public static void processInputAndCallFunctions() {
        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();
        String[] strArr = inputString.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        if (intArr.length == 2) {
            System.out.print(calculate(intArr[0], intArr[1]));
        } else if (intArr.length == 3) {
            System.out.print(calculate(intArr[0], intArr[1], intArr[2]));
        }
    }

    public static void main(String[] args) {
        processInputAndCallFunctions();
    }

    public static int calculate(int x, int y) {
        return x * y;
    }

    public static int calculate(int x, int y, int z) {
        return (x + y) * z;
    }
}