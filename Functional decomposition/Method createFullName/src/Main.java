import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName1 = scanner.next();
        String lastName1 = scanner.next();
    }

    public static String createFullName(String name1, String lastName1) {
        return name1 + " " + lastName1;
    }
}