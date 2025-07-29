package SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.impl;

import SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.Scanner;

public class MyScanner implements Scanner {
    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}
