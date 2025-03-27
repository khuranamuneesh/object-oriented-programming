import java.util.ArrayList;

// BankAccount class represents an individual bank account
class BankAccount {
    private static double interestRate = 7.0; // interest rate same for all accounts
    private double balance;
    private String accountNumber;

    // Constructor to initialize the bank account details
    public BankAccount(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in the account, enter less amount to withdraw");
        }
    }

    // Method to view the account balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }
}

// Customer class represents a customer who has accounts in a bank
class Customer {
    private String name;
    private ArrayList<BankAccount> accounts; // A customer can have multiple accounts

    // Constructor to initialize customer details
    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    // Method to open a new account for the customer
    public void openAccount(BankAccount account) {
        accounts.add(account);
    }

    // Method to view the balance of all accounts associated with the customer
    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (BankAccount account : accounts) {
            account.displayAccountDetails(); // Displaying balance for each account
            System.out.println("-------------------------------");
        }
    }
}

// Bank class represents a bank which manages customers and their accounts
class Bank
{
    private String bankName;

    // Constructor to initialize the bank name
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Method to open an account for a customer
    public void openAccountForCustomer(Customer customer, BankAccount account) {
        customer.openAccount(account); // Adding the account to the customer's list of accounts
    }
}

// Main class to test the association between Bank and Customer
public class BankAndAccountHolders {
    public static void main(String[] args) {
        // Creating bank objects
        Bank bank1 = new Bank("State Bank of India");

        // Creating customer objects
        Customer customer1 = new Customer("Muneesh");
        Customer customer2 = new Customer("Rahul");
        Customer customer3 = new Customer("Akash");

        // Creating bank account objects
        BankAccount acc1 = new BankAccount("1871", 5000);
        BankAccount acc2 = new BankAccount("7845", 10000);
        BankAccount acc3 = new BankAccount("6924", 2000);

        // Bank opens accounts for the customers (association)
        bank1.openAccountForCustomer(customer1, acc1);
        bank1.openAccountForCustomer(customer2, acc2);
        bank1.openAccountForCustomer(customer3, acc3);

        // Viewing the balance of accounts for each customer
        customer1.viewBalance();
        customer2.viewBalance();
        customer3.viewBalance();
    }
}

