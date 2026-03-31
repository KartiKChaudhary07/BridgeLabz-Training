import java.util.*;

interface TransferService {
    void transfer(Wallet from, Wallet to, double amount) throws InsufficientBalanceException;
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class User {
    int id;
    String name;
    Wallet wallet;

    User(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.wallet = new Wallet(balance);
    }
}

class Wallet {
    double balance;
    List<String> transactions = new ArrayList<>();

    Wallet(double balance) {
        this.balance = balance;
    }

    void addMoney(double amount) {
        balance += amount;
        transactions.add("Added: " + amount);
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance!");
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }

    void showHistory() {
        System.out.println("Transaction History:");
        for (String t : transactions)
            System.out.println(t);
    }
}

class WalletTransfer implements TransferService {
    public void transfer(Wallet from, Wallet to, double amount) throws InsufficientBalanceException {
        from.withdraw(amount);
        to.addMoney(amount);
        from.transactions.add("Transferred: " + amount);
        to.transactions.add("Received: " + amount);
    }
}

public class DigitalWalletSystem {
    public static void main(String[] args) {
        try {
            User u1 = new User(1, "Kartik", 5000);
            User u2 = new User(2, "Rahul", 2000);

            TransferService service = new WalletTransfer();

            u1.wallet.addMoney(1000);
            service.transfer(u1.wallet, u2.wallet, 1500);

            System.out.println("Kartik Balance: " + u1.wallet.balance);
            System.out.println("Rahul Balance: " + u2.wallet.balance);

            u1.wallet.showHistory();
            u2.wallet.showHistory();

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
