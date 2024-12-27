import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0;
        int temperature = 0;

        while (temperature < 100) {
            temperature = scanner.nextInt();
            if (temperature < 100) {
                maxTemperature = temperature;
            }
        }

        System.out.println(maxTemperature);

        scanner.close();
    }
}