import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char majuscule = Character.toUpperCase(ch);
        if (majuscule == 'A' || majuscule == 'E' || majuscule == 'I' || majuscule == 'O' || majuscule == 'U' ) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}