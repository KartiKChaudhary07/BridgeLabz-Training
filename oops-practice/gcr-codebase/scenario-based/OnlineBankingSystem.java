
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Account {
    protected int accountNumber;
    protected double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    synchronized void withdraw(double amount)
            throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
    }

    synchronized void deposit(double amount) {
        balance += amount;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }
}

interface BankService {
    void transfer(Account from, Account to, double amount)
            throws InsufficientBalanceException;
}

class BankServiceImpl implements BankService {
    public synchronized void transfer(Account from, Account to, double amount)
            throws InsufficientBalanceException {
        from.withdraw(amount);
        to.deposit(amount);
    }
}

public class OnlineBankingSystem {
    public static void main(String[] args) {

        SavingsAccount acc1 = new SavingsAccount(1001, 10000);
        CurrentAccount acc2 = new CurrentAccount(2001, 5000);

        BankService service = new BankServiceImpl();

        Thread t1 = new Thread(() -> {
            try {
                service.transfer(acc1, acc2, 3000);
                System.out.println("Transfer Successful");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                service.transfer(acc1, acc2, 4000);
                System.out.println("Transfer Successful");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        t1.start();
        t2.start();
    }
}