import java.util.Scanner;

class Account {
    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        }
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Account Creation
        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Account Number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(name, accountNumber, balance);

        // Deposit and Withdrawal
        System.out.print("Deposit amount: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.print("Withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);

        sc.close();
    }
}
