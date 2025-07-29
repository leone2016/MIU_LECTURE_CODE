package SWE.lesson5.solid_principles._2_open_close.bad_design.ecommerceapp.entity;

public class Product {
    private String name;
    private double price;
    private String type; // e.g., "regular", "discounted", "seasonal"

    public Product(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
