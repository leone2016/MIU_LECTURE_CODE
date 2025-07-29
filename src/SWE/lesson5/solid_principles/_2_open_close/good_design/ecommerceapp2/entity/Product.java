package SWE.lesson5.solid_principles._2_open_close.good_design.ecommerceapp2.entity;

import SWE.lesson5.solid_principles._2_open_close.good_design.ecommerceapp2.contract.DiscountStrategy;

// Product now holds a reference to a discount strategy
public class Product {
    private String name;
    private double price;
    private DiscountStrategy discountStrategy; // Reference to the strategy

    public Product(String name, double price, DiscountStrategy discountStrategy) {
        this.name = name;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Delegate discount calculation to the strategy
    public double getDiscountedPrice() {
        return discountStrategy.applyDiscount(price);
    }
}
