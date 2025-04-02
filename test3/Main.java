package test3;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456789", 1000.0, "John Doe", "Savings");

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Account Type: " + account.getAccountType());

        Product product = new Product("Laptop", 999.99, 10, "High-performance laptop with 16GB RAM");

        System.out.println("Product Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Description: " + product.getDescription());
    }

}
