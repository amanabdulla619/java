import java.util.Vector;

class FruitVector {
    public static void main(String[] args) {

        // Create a Vector to store fruits
        Vector<String> fruits = new Vector<>();

        // Add 5 fruits
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Display each fruit using enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
