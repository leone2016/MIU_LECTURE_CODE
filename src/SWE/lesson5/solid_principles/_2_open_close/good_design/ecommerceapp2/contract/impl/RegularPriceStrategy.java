package SWE.lesson5.solid_principles._2_open_close.good_design.ecommerceapp2.contract.impl;

import SWE.lesson5.solid_principles._2_open_close.good_design.ecommerceapp2.contract.DiscountStrategy;

public class RegularPriceStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price; // No discount
    }

}
