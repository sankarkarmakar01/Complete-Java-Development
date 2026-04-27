package oop.encapsulation;

public class Account {
    private double balance; // Private data (Data Hiding)

    public Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    // Getter (Accessor)
    public double getBalance() {
        return balance;
    }

    // Setter (Mutator) with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void calculateInterest() {
        System.out.println("Calculating generic interest...");
    }
}