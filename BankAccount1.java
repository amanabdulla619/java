import java.util.Scanner;

class BankAccount {
    int accountNo;
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(int accountNo, String accountHolder, double balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Create object
        BankAccount account = new BankAccount(accNo, name, balance);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        // Perform deposit
        account.deposit(amount);

        // Display updated details
        System.out.println("\n--- Bank Account Details ---");
        account.displayDetails();

        sc.close();
    }
}
