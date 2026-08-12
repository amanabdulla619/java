import java.util.Scanner;

class Employee {
    String name;
    String address;
    int age;
    int mob;
    float sal;

    Employee(String name, String address, int age, int mob, float sal) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mob = mob;
        this.sal = sal;
    }

    void print_Salary() {
        System.out.println("Salary: " + sal);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mob);
        print_Salary();
    }
}

class Officer extends Employee {
    String spl;

    Officer(String name, String address, int age, int mob,
            float sal, String spl) {
        super(name, address, age, mob, sal);
        this.spl = spl;
    }

    void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }

    void displayOfficer() {
        System.out.println("\n--- Officer Details ---");
        display();
        print_Specialization();
    }
}

class Manager extends Employee {
    String dep;

    Manager(String name, String address, int age, int mob,
            float sal, String dep) {
        super(name, address, age, mob, sal);
        this.dep = dep;
    }

    void print_Dept() {
        System.out.println("Department: " + dep);
    }

    void displayManager() {
        System.out.println("\n--- Manager Details ---");
        display();
        print_Dept();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Officer details
        System.out.print("Enter Officer's Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Mobile: ");
        int mob = sc.nextInt();

        System.out.print("Enter Salary: ");
        float sal = sc.nextFloat();

        sc.nextLine();

        System.out.print("Enter Specialization: ");
        String spl = sc.nextLine();

        Officer o = new Officer(name, address, age, mob, sal, spl);

        // Manager details
        System.out.print("\nEnter Manager's Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Mobile: ");
        mob = sc.nextInt();

        System.out.print("Enter Salary: ");
        sal = sc.nextFloat();

        sc.nextLine();

        System.out.print("Enter Department: ");
        String dep = sc.nextLine();

        Manager m = new Manager(name, address, age, mob, sal, dep);

        // Display details
        o.displayOfficer();
        m.displayManager();

        sc.close();
    }
}
