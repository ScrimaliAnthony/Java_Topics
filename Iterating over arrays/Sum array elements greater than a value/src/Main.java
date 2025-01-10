import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        int n;
        for(int i = 0; i < arraySize; i++){
            array[i] = sc.nextInt();
        }
        n = sc.nextInt();
        for(int arr : array){
            if(arr > n){
                result = result + arr;
            }
        }
        System.out.println(result);
    }
}