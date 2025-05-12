import java.util.Date;

public class Exercise11_03 {
    public static void main(String[] args) {
        Account2 account = new Account2();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println(account);

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(1000);
        System.out.println(savingsAccount);

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit(2000);
        checkingAccount.withdraw(1000);
        System.out.println(checkingAccount);
    }
}

class Account {
    int id;
    double balance;
    double annualInterestRate;
    Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public String toString() {
        return "Balance: " + balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    @Override
    public void withdraw(double amount) {
    }
}

class CheckingAccount extends Account {
    double overdraftLimit = 1000;

    public CheckingAccount() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= overdraftLimit) {
            balance -= amount;
        }
    }
}
