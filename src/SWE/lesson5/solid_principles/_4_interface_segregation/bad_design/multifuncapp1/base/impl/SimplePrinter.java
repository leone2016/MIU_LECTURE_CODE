package SWE.lesson5.solid_principles._4_interface_segregation.bad_design.multifuncapp1.base.impl;

import SWE.lesson5.solid_principles._4_interface_segregation.bad_design.multifuncapp1.base.AllInOneMachine;

// A simple printer only needs print functionality
public class SimplePrinter implements AllInOneMachine {

    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        // This printer cannot scan, but we are forced to implement this method.
        // This is a violation of ISP.
        throw new UnsupportedOperationException("Scan not supported on this printer.");
    }

    @Override
    public void fax(String document) {
        // This printer cannot fax, but we are forced to implement this method.
        throw new UnsupportedOperationException("Fax not supported on this printer.");
    }

    @Override
    public void copy(String document) {
        // This printer cannot copy, but we are forced to implement this method.
        throw new UnsupportedOperationException("Copy not supported on this printer.");
    }
}
