import java.util.Scanner;

class Students {
    String name;
    int rollNo;
    String course;

    void setDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {
    float collegeFee;

    void setCollegeFee(float collegeFee) {
        this.collegeFee = collegeFee;
    }

    void displayCollegeFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount {
    float hostelFee;
    float messFee;

    void setHostelDetails(float hostelFee, float messFee) {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayHosteller() {
        System.out.println("\n--- HOSTELLER DETAILS ---");
        displayDetails();
        System.out.println("College Fee: " + collegeFee);
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        System.out.println("Total Fee: "
                + (collegeFee + hostelFee + messFee));
    }
}

class DayScholar extends StudentAccount {
    float busFee;

    void setBusFee(float busFee) {
        this.busFee = busFee;
    }

    void displayDayScholar() {
        System.out.println("\n--- DAY SCHOLAR DETAILS ---");
        displayDetails();
        System.out.println("College Fee: " + collegeFee);
        System.out.println("Bus Fee: " + busFee);
        System.out.println("Total Fee: "
                + (collegeFee + busFee));
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Hosteller details
        System.out.print("Enter Hosteller's Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter College Fee: ");
        float collegeFee = sc.nextFloat();

        System.out.print("Enter Hostel Fee: ");
        float hostelFee = sc.nextFloat();

        System.out.print("Enter Mess Fee: ");
        float messFee = sc.nextFloat();
        sc.nextLine();

        Hosteller h = new Hosteller();
        h.setDetails(name, rollNo, course);
        h.setCollegeFee(collegeFee);
        h.setHostelDetails(hostelFee, messFee);

        // Day Scholar details
        System.out.print("\nEnter Day Scholar's Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter College Fee: ");
        collegeFee = sc.nextFloat();

        System.out.print("Enter Bus Fee: ");
        float busFee = sc.nextFloat();

        DayScholar d = new DayScholar();
        d.setDetails(name, rollNo, course);
        d.setCollegeFee(collegeFee);
        d.setBusFee(busFee);

        // Display details
        h.displayHosteller();
        d.displayDayScholar();

        sc.close();
    }
}
