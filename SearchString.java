import java.util.Vector;
import java.util.Scanner;

class SearchString {
    public static void main(String[] args) {

        // Create a Vector
        Vector<String> items = new Vector<>();

        // Add elements
        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get item from user
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        // Search for the item
        if (items.contains(item)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        sc.close();
    }
}
