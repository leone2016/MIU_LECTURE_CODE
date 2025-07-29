package SWE.lesson5.solid_principles._4_interface_segregation.bad_design.multifuncapp1.base;


import SWE.lesson5.solid_principles._4_interface_segregation.bad_design.multifuncapp1.base.impl.FaxMachine;
import SWE.lesson5.solid_principles._4_interface_segregation.bad_design.multifuncapp1.base.impl.SimplePrinter;

public class BadMachineApp {
    public static void main(String[] args) {
        SimplePrinter printer = new SimplePrinter();
        printer.print("MyReport.pdf");
        // printer.scan("Image.jpg"); // This would throw an UnsupportedOperationException

        FaxMachine faxer = new FaxMachine();
        faxer.fax("Contract.doc");
        // faxer.print("Letter.txt"); // This would throw an UnsupportedOperationException
    }
}
