package FPP.lectureCode.lesson3.herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        StaffPerson proff = new Proffesor("John Doe", "123 Main St", "555-1234", "Car", 5);
        StaffPerson proff2 = new Proffesor("John Doe", "123 Main St", "555-1234", "Car", 5);
        StaffPerson secre1 = new Secretary("Jane Smith", "456 Oak St", "555-5678", "Bike", 3, 200);
        StaffPerson secre2 = new Secretary("Jane Smith", "456 Oak St", "555-5678", "Bike", 3, 200);

        System.out.println(secre2.equals(proff2));
       // System.out.println(proff.getName() + "'s salary: $" + secre1.computeSalary());
        System.out.println(secre1.hashCode());
        Object obj1 = (Object) proff;

        //String [] test = {"ads", "bsdsd", "csdsd", 12312};

        StaffPerson[] staff = {proff, secre1, secre2};

        for (StaffPerson sp : staff) {
            System.out.println(sp.getName() + "'s salary: $" + sp.computeSalary());
        }

        //secre1 es instancia de Staff Person
        // IS-A
        if (proff instanceof StaffPerson) {
            System.out.println(secre1.getName() + " is a StaffPerson");
        }
        // LSP
        printStaffNames(proff); // Proffesor
        printStaffNames(secre1); // Secretary
        ////StaffPerson<String> staffList = new ArrayList<>();

        ServiceSRI service = new IServiceSRI();
        service.computeTax();

        String test = "hola";





        

    }

    /**
     * Concepto: Se pregunta si una instancia de la subclase puede usarse en cualquier lugar donde se espera una
     * instancia de la superclase sin alterar la corrección del programa.
     * @param staff
     */
    public static void printStaffNames(StaffPerson staff) {
        System.out.println(staff.getName());
    }
}
