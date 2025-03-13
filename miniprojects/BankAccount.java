package Miniprojects;

import java.text.NumberFormat;

public class BankAccount {
    private String accName;
    private long accNumber;
    private double balance;

    // default COnstructor
    public BankAccount(String accNameIn, long accNumberIn) {
        accName = accNameIn;
        accNumber = accNumberIn;
        balance = 0.0;

    }// end constructor

    // Setters
    public void withdraw(double balanceOut) {
        if (balance > balanceOut) {
            balance = balance - balanceOut;
        } else {
            System.out.println("You don't have enough balance.");
        }
    }

    public void deposit(double balanceIn) {
        balance = balance + balanceIn;
    }

    public void setName(String accNameIn) {
        accName = accNameIn;
    }

    public void setAccNumber(long accNumberIn) {
        accNumber = accNumberIn;

    }

    // Getters
    public double checkBalance() {
        return balance;
    }

    public String getName() {
        return accName;
    }

    public long getNum() {
        return accNumber;
    }

    public String toString() {
        String toScreen;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        toScreen = "Your latest balance for your account is: " + money.format(balance);
        return toScreen;
    }

    public void printOut() {
        System.out.println("Balance for account " + accName + "is: " + balance);
    }
}
