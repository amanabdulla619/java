import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book information
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first book
        System.out.print("Enter first book title: ");
        String title1 = sc.nextLine();

        System.out.print("Enter first book author: ");
        String author1 = sc.nextLine();

        System.out.print("Enter first book price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        // Input for second book
        System.out.print("Enter second book title: ");
        String title2 = sc.nextLine();

        System.out.print("Enter second book author: ");
        String author2 = sc.nextLine();

        System.out.print("Enter second book price: ");
        double price2 = sc.nextDouble();

        // Create objects
        Book b1 = new Book(title1, author1, price1);
        Book b2 = new Book(title2, author2, price2);

        // Display details
        System.out.println("\n--- First Book Details ---");
        b1.displayBook();

        System.out.println("\n--- Second Book Details ---");
        b2.displayBook();

        sc.close();
    }
}
