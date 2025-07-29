package SWE.lesson5.solid_principles._2_open_close.good_design.ecommerceapp2.contract;

// Step 1: Define an abstraction (interface) for discount calculation
public interface DiscountStrategy {
    double applyDiscount(double price);
}
