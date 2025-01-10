import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        int arrayNumber;
        int number;
        boolean isInArray = false;

        for(int i = 0; i < array.length; i++) {
            arrayNumber = sc.nextInt();
            array[i] = arrayNumber;
        }

        number = sc.nextInt();

        for(int i = 0; i < array.length; i++) {
           if(array[i] == number) {
               isInArray = true;
               break;
           }
        }

        System.out.print(isInArray);
    }
}