class BankAccount {
    String accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
}

class FixedDepositAccount extends BankAccount {
    int lockInPeriod;
}