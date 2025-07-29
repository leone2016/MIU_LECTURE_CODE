package SWE.lesson5.solid_principles._2_open_close.good_design.ecommerceapp2;

import SWE.lesson5.solid_principles._2_open_close.good_design.ecommerceapp2.contract.impl.RegularPriceStrategy;
import SWE.lesson5.solid_principles._2_open_close.good_design.ecommerceapp2.contract.impl.TenPercentDiscountStrategy;
import SWE.lesson5.solid_principles._2_open_close.good_design.ecommerceapp2.entity.Product;

public class EcommerceApp {
    public static void main(String[] args) {
        var apples = new Product("Apples", 1.0, new RegularPriceStrategy());

        var price = apples.getDiscountedPrice();
        System.out.println("Price of " + apples.getName() + " after discount: " + price);

        var samsung = new Product("Samsung Galaxy S25", 1699.99, new TenPercentDiscountStrategy());
        var samsungPrice = samsung.getDiscountedPrice();
        System.out.println("Price of " + samsung.getName() + " after discount: " + samsungPrice);
    }
}
