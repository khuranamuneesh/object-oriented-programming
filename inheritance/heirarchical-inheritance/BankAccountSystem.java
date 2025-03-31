// Base class
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate)
    {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType()
    {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// CheckingAccount subclass
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit)
    {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType()
    {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

// FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount
{
    private int tenure;

    public FixedDepositAccount(String accountNumber, double balance, int tenure)
    {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Account Tenure: " + tenure + " years");
    }
}

// Main class to test
public class BankAccountSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount("S10001", 1562.0, 6.5);
        SavingsAccount savingsAccount2 = new SavingsAccount("S10002", 14685.0, 7.2);
        SavingsAccount savingsAccount3 = new SavingsAccount("S10003", 25417.0, 5.1);

        CheckingAccount checkAcc1 = new CheckingAccount("C67890", 3000.0, 1000.0);
        CheckingAccount checkAcc2 = new CheckingAccount("C67890", 3000.0, 1000.0);

        FixedDepositAccount fixed1 = new FixedDepositAccount("F11223", 10000.0, 5);

        System.out.println("The account details: ");
        savingsAccount1.displayDetails();
        savingsAccount2.displayDetails();
        savingsAccount3.displayDetails();
        System.out.println("-------------------------------\n");

        System.out.println("Current Account details: ");
        checkAcc1.displayDetails();
        checkAcc2.displayDetails();
        System.out.println("-------------------------------\n");

        fixed1.displayDetails();
        fixed1.displayAccountType();
    }
}

