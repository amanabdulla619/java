import java.util.Vector;

class LargestNumber {
    public static void main(String[] args) {

        // Create an Integer Vector
        Vector<Integer> numbers = new Vector<>();

        // Add elements
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);

        // Assume first element is the largest
        int max = numbers.get(0);

        // Find the largest number
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        // Display the largest number
        System.out.println("Largest number = " + max);
    }
}
