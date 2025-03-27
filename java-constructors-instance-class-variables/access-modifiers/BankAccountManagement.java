import java.util.Scanner;

class BankAccount {
    // Public, Protected, and Private attributes
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs" + amount);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs" + balance);
    }
}

// Subclass demonstrating access to accountNumber and accountHolder
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        displayAccountDetails(); // Accessing parent class method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a BankAccount object
        Scanner input = new Scanner(System.in);
        BankAccount account1 = new BankAccount("123456789", "Muneesh Khurana", 5000.0);
        System.out.println("Bank Account Details:");
        account1.displayAccountDetails();
        System.out.println();
        System.out.println("Enter the Money to be deposited: ");
        double depositMoney = input.nextDouble();
        account1.deposit(depositMoney);
        account1.displayAccountDetails();
        System.out.println();
        System.out.println("Enter the money to be withdrawn");
        double withdrawMoney = input.nextDouble();
        account1.withdraw(withdrawMoney);
        account1.displayAccountDetails();

        // Creating a SavingsAccount object
        SavingsAccount savings1 = new SavingsAccount("987654321", "Ram", 8000.0, 2.5);
        System.out.println("\nSavings Account Details:");
        savings1.displaySavingsAccountDetails();
    }
}
