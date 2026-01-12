import java.util.*;

interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double getBalance();
    double calculateInterest();
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

abstract class Account implements BankService {
    protected int accountNo;
    protected String name;
    protected double balance;
    protected List<String> transactions = new ArrayList<>();

    public Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance!");
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void showTransactions() {
        System.out.println("Transaction History:");
        for (String t : transactions)
            System.out.println(t);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}

public class OnlineBankingSystem {
    public static void main(String[] args) {
        try {
            Account a1 = new SavingsAccount(101, "Kartik", 10000);
            Account a2 = new CurrentAccount(102, "Rahul", 5000);

            a1.deposit(2000);
            a1.withdraw(1500);

            a2.deposit(3000);
            a2.withdraw(1000);

            System.out.println("Savings Balance: " + a1.getBalance());
            System.out.println("Savings Interest: " + a1.calculateInterest());
            a1.showTransactions();

            System.out.println("\nCurrent Balance: " + a2.getBalance());
            System.out.println("Current Interest: " + a2.calculateInterest());
            a2.showTransactions();

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
