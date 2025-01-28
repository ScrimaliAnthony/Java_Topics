import java.util.Scanner;

public class Main {
    public static class Book {
        private String title;
        private String author;
        private int numberOfPages;

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return this.author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getNumberOfPages() {
            return this.numberOfPages;
        }

        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book = new Book();

        book.setTitle(scanner.nextLine());
        book.setAuthor(scanner.nextLine());
        book.setNumberOfPages(scanner.nextInt());

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());

        scanner.close();
    }
}