package SWE.lesson5.solid_principles._2_open_close.bad_design.ecommerceapp.service;


import SWE.lesson5.solid_principles._2_open_close.bad_design.ecommerceapp.entity.Product;

public class DiscountCalculatorService {

    public double calculateDiscountedPrice(Product product) {
        double discountedPrice = product.getPrice();

        if (product.getType().equals("regular")) {
            // No discount for regular products
            discountedPrice = product.getPrice();
        } else if (product.getType().equals("discounted")) {
            // 10% discount for discounted products
            discountedPrice = product.getPrice() * 0.90;
        } else if (product.getType().equals("seasonal")) {
            // 20% discount for seasonal products
            discountedPrice = product.getPrice() * 0.80;
        }
        // ... what if a new "loyalty" product type is introduced?
        // We would have to modify THIS method!

        return discountedPrice;
    }
}
