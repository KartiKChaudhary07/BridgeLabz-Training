
class BankAccount {
    double balance = 700;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdraw amount is : " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.showBalance();
        acc.deposit(200);
        acc.showBalance();
        acc.withdraw(100);
        acc.showBalance();
        acc.withdraw(1000);
    }
}
