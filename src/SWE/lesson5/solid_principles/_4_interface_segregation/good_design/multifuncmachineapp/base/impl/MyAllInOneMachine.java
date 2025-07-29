package SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.impl;

import SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.Copier;
import SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.Faxer;
import SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.Printer;
import SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.Scanner;

// A truly All-in-One machine can implement all relevant interfaces
public class MyAllInOneMachine implements Printer, Scanner, Faxer, Copier {
    @Override
    public void print(String document) {
        System.out.println("All-in-One: Printing " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("All-in-One: Scanning " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("All-in-One: Faxing " + document);
    }

    @Override
    public void copy(String document) {
        System.out.println("All-in-One: Copying " + document);
    }
}
