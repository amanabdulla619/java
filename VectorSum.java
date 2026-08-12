import java.util.Vector;

class VectorSum {
    public static void main(String[] args) {

        // Create an Integer Vector
        Vector<Integer> numbers = new Vector<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Calculate sum
        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }

        // Display sum
        System.out.println("Sum of all elements = " + sum);
    }
}
