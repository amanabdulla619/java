import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance         : " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount b = new BankAccount(accNo, holder, bal);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        b.deposit(amount);

        System.out.println("\nUpdated Account Details");
        b.displayDetails();

        sc.close();
    }
}
