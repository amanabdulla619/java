import java.util.Scanner;

class Marks {
    int mark1, mark2, mark3;

    // Constructor
    Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate and display total and average
    void calculate() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        // Create object
        Marks student = new Marks(m1, m2, m3);

        // Display result
        System.out.println("\n--- Result ---");
        student.calculate();

        sc.close();
    }
}
