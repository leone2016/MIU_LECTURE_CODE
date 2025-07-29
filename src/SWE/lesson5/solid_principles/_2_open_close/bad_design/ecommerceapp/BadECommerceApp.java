package SWE.lesson5.solid_principles._2_open_close.bad_design.ecommerceapp;


import SWE.lesson5.solid_principles._2_open_close.bad_design.ecommerceapp.entity.Product;
import SWE.lesson5.solid_principles._2_open_close.bad_design.ecommerceapp.service.DiscountCalculatorService;

public class BadECommerceApp {
    public static void main(String[] args) {
        Product regularProduct = new Product("Laptop", 1000.0, "regular");
        Product discountedProduct = new Product("Mouse", 50.0, "discounted");
        Product seasonalProduct = new Product("Keyboard", 80.0, "seasonal");

        DiscountCalculatorService calculator = new DiscountCalculatorService();

        System.out.println("Laptop discounted price: " + calculator.calculateDiscountedPrice(regularProduct));
        System.out.println("Mouse discounted price: " + calculator.calculateDiscountedPrice(discountedProduct));
        System.out.println("Keyboard discounted price: " + calculator.calculateDiscountedPrice(seasonalProduct));

        // Imagine a new product type "clearance" needs to be added
        // with a 30% discount.
        // We would have to open the DiscountCalculatorService class
        // and modify the calculateDiscountedPrice method.
        // This violates OCP.
    }
}
