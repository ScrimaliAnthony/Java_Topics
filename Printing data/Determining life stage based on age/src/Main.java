import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the integer
        int age = sc.nextInt();

        if (age <= 12) {
            System.out.print("Child");
        } else if (age >= 13 && age <= 17) {
            System.out.print("Teenager");
        } else if (age >= 18 && age <= 59) {
            System.out.print("Adult");
        } else {
            System.out.print("Senior Citizen");
        }

        sc.close();        
    }
}