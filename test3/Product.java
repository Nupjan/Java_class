package test3;

public class Product {
    private String name; // Instance variable
    private double price; // Instance variable
    private int quantity; // Instance variable
    private String description; // Instance variable

    // Constructor
    public Product(String name, double price, int quantity, String description) {
        this.name = name; // Use 'this' to refer to the instance variable
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    // Optional: Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}