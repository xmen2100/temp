import java.util.Date;
import java.util.Scanner;

public class Exercise10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] account = new Account[10];
        account[0] = new Account(0, 100);
        account[1] = new Account(1, 100);
        account[2] = new Account(2, 100);
        account[3] = new Account(3, 100);
        account[4] = new Account(4, 100);
        account[5] = new Account(5, 100);
        account[6] = new Account(6, 100);
        account[7] = new Account(7, 100);
        account[8] = new Account(8, 100);
        account[9] = new Account(9, 100);

        while (true) {
            int id;
            while (true) {
                System.out.print("Enter an id: ");
                id = input.nextInt();

                if (id >= 0 && id <= account.length - 1) {
                    break;
                }
                else {
                    System.out.println("Invalid ID, please try again\n");
                }
            }

            while (true) {
                System.out.println("\nMain menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("The balance is " + account[id].getBalance());
                }
                else if (choice == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    account[id].withdraw(input.nextDouble());
                }
                else if (choice == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    account[id].deposit(input.nextDouble());
                }
                else if (choice == 4) {
                    System.out.println();
                    break;
                }
            }
        }
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
