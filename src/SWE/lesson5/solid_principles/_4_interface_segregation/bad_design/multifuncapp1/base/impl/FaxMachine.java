package SWE.lesson5.solid_principles._4_interface_segregation.bad_design.multifuncapp1.base.impl;

import SWE.lesson5.solid_principles._4_interface_segregation.bad_design.multifuncapp1.base.AllInOneMachine;

// A Fax machine only needs fax functionality
public class FaxMachine implements AllInOneMachine {

    @Override
    public void print(String document) {
        throw new UnsupportedOperationException("Print not supported on this fax machine.");
    }

    @Override
    public void scan(String document) {
        throw new UnsupportedOperationException("Scan not supported on this fax machine.");
    }

    @Override
    public void fax(String document) {
        System.out.println("Faxing: " + document);
    }

    @Override
    public void copy(String document) {
        throw new UnsupportedOperationException("Copy not supported on this fax machine.");
    }
}
