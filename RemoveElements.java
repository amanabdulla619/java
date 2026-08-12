import java.util.Vector;

class RemoveElement {
    public static void main(String[] args) {

        // Create a Vector
        Vector<String> colors = new Vector<>();

        // Add elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Remove Green
        colors.remove("Green");

        // Display final contents
        System.out.println("Final Vector:");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
