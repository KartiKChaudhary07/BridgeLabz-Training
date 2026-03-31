abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { balance -= amt; }

    abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
}

class SavingsAccount extends BankAccount {
    public double calculateInterest() { return balance * 0.04; }
}

class CurrentAccount extends BankAccount {
    public double calculateInterest() { return 0; }
}
class FixedDepositAccount extends BankAccount implements Loanable {
    private int tenureInYears;

    public FixedDepositAccount(int tenure) {
        this.tenureInYears = tenure;
    }

    public double calculateInterest() { return balance * 0.06 * tenureInYears; }

    public void applyForLoan() {
        System.out.println("Loan application for Fixed Deposit Account submitted.");
    }
}