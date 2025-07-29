package SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.impl;

import SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.Printer;

public class SimplePrinter implements Printer {

    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}
