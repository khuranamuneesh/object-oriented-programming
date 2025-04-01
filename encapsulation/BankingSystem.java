// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        }
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }
    public String getHolderName()
    {
        return holderName;
    }
    public double getBalance()
    {
        return balance;
    }
}

interface Loanable //interface
{
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Savings Account class
class SavingsAccount extends BankAccount
{
    private static final double INTEREST_RATE = 0.07; // 7% interest

    public SavingsAccount(String accountNumber, String holderName, double balance)
    {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest()
    {
        return getBalance() * INTEREST_RATE;
    }
}

// Current Account class
class CurrentAccount extends BankAccount implements Loanable
{
    private static final double INTEREST_RATE = 0.02; // 2% interest
    private double loanAmount;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    public void applyForLoan(double amount) {
        if (amount > 0) {
            loanAmount += amount;
            System.out.println("Loan of " + amount + " applied successfully.");
        } else {
            System.out.println("Invalid loan amount.");
        }
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 5000; // Eligible if balance is above 5000
    }
}

// Main class to test the system
public class BankingSystem
{
    public static void main(String[] args)
    {
        BankAccount[] accounts = {
                new SavingsAccount("987654321", "Namit", 10000),
                new CurrentAccount("123456789", "Kavita", 70000)
        };

        System.out.println("Account Details and Interest: ");
        for (BankAccount account : accounts)
        {
            account.displayAccountDetails();
            double interest = account.calculateInterest();
            System.out.println("Interest Earned: " + interest);
            System.out.println();
        }

        // Loan processing for CurrentAccount
        CurrentAccount current = new CurrentAccount("456123789", "Chaman", 24000);
        current.displayAccountDetails();
        if (current.calculateLoanEligibility())
        {
            current.applyForLoan(50000);
        }
        else
        {
            System.out.println("Not Eligible for Loan");
        }
    }
}
