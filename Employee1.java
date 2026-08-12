import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    // Constructor
    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first employee
        System.out.print("Enter Employee 1 ID: ");
        int id1 = sc.nextInt();

        System.out.print("Enter Employee 1 Name: ");
        String name1 = sc.next();

        System.out.print("Enter Employee 1 Salary: ");
        double salary1 = sc.nextDouble();

        // Input for second employee
        System.out.print("Enter Employee 2 ID: ");
        int id2 = sc.nextInt();

        System.out.print("Enter Employee 2 Name: ");
        String name2 = sc.next();

        System.out.print("Enter Employee 2 Salary: ");
        double salary2 = sc.nextDouble();

        // Create objects
        Employee e1 = new Employee(id1, name1, salary1);
        Employee e2 = new Employee(id2, name2, salary2);

        // Display details
        System.out.println("\n--- Employee 1 Details ---");
        e1.displayEmployee();

        System.out.println("\n--- Employee 2 Details ---");
        e2.displayEmployee();

        sc.close();
    }
}
