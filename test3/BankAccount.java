package test3;

public class BankAccount {
    private String accountNumber; // Instance variable
    private double balance; // Instance variable
    private String ownerName; // Instance variable
    private String accountType; // Instance variable

    // Constructor
    public BankAccount(String accountNumber, double balance, String ownerName, String accountType) {
        this.accountNumber = accountNumber; // Use 'this' to refer to the instance variable
        this.balance = balance;
        this.ownerName = ownerName;
        this.accountType = accountType;
    }

    // Optional: Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}