package SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp;


import SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.Printer;
import SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.Scanner;
import SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.impl.MyAllInOneMachine;
import SWE.lesson5.solid_principles._4_interface_segregation.good_design.multifuncmachineapp.base.impl.SimplePrinter;

public class GoodMultiFuncMachineApp {
    public static void main(String[] args) {
        SimplePrinter printer = new SimplePrinter();
        printer.print("AnnualReport.pdf");
        // printer.scan("Image.jpg"); // Compile-time error, as MySimplePrinter doesn't implement Scanner

        //MyFaxMachine faxer = new MyFaxMachine();
        //faxer.fax("UrgentContract.doc");
        // faxer.print("Letter.txt"); // Compile-time error, as MyFaxMachine doesn't implement Printer

        MyAllInOneMachine fullMachine = new MyAllInOneMachine();
        fullMachine.print("Presentation.ppt");
        fullMachine.scan("Receipt.jpg");
        fullMachine.fax("Invoice.pdf");
        fullMachine.copy("BookChapter.txt");

        // Client code only depends on what it needs
        processPrintJob(printer);
        processScanJob(fullMachine); // fullMachine can be used as a Scanner
    }

    // Example of client code using specific interfaces
    public static void processPrintJob(Printer p) {
        p.print("Job from processPrintJob.");
    }

    public static void processScanJob(Scanner s) {
        s.scan("Job from processScanJob.");
    }
}
