package SWE.lesson5.solid_principles._4_interface_segregation.bad_design.multifuncapp1.base;

// Bad Example: Violating Interface Segregation Principle

// A "fat" interface for an All-in-One Office Machine
public interface AllInOneMachine {
    void print(String document);
    void scan(String document);
    void fax(String document);
    void copy(String document);
}
