import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print(isDivByThreeAndFive());
        } else if (num % 3 == 0) {
            System.out.print(isDivByThree());
        } else if (num % 5 == 0) {
            System.out.print(isDivByFive());
        } else {
            System.out.print("None");
        }
    }
    public static String isDivByThree() {
        return "Fizz";
    }

    public static String isDivByFive() {
        return "Buzz";
    }

    public static String isDivByThreeAndFive() {
        return "FizzBuzz";
    }
}