import java.util.Scanner;

public class ATM {
    public static void main(String[] args)
    {
        BankAccount obj = new BankAccount();
        obj.takeUserInput();
        obj.depositMoney();
        obj.withdrawMoney();
        obj.printBalance();
    }
}
 class BankAccount
 {
     String accountHolder;
     long accountNumber;
     int balance;

     void takeUserInput()
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Customer Details");
         System.out.print("Enter the Account Holder name: ");
         this.accountHolder = input.nextLine();
         System.out.print("Enter the Account Number: ");
         this.accountNumber = input.nextLong();
         System.out.print("Enter the balance: ");
         this.balance = input.nextInt();
     }
     void depositMoney()
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the money to be deposited: ");
         int money = input.nextInt();
         this.balance += money;
         System.out.println("Balance after depositing in " + this.accountHolder + " Account: " + this.balance);
     }
     void withdrawMoney()
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the money to be withdrawn in " + this.accountHolder + " account: ");
         int money = input.nextInt();
         if(money <= this.balance)
         {
             this.balance -= money;
             System.out.println("Balance after withdrawing: " + this.balance);
         }
         else
         {
             System.out.println("Not enough funds in the account");
         }
     }
     void printBalance()
     {
         System.out.println("The current balance in " + this.accountHolder + " account: " + this.balance);
     }
 }