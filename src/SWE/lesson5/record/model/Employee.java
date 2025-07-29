package SWE.lesson5.record.model;

import java.time.LocalDate;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
//    private Money salary;//value object type
    private MoneyRecord salary;//value object type

    public Employee(Integer employeeId, String firstName, String lastName, LocalDate dateOfBirth, MoneyRecord salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }
    public Employee() {
        this(null, null, null, null, null);
    }


    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

//    public Money getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Money salary) {
//        this.salary = salary;
//    }

    public MoneyRecord getSalary() {
        return salary;
    }

    public void setSalary(MoneyRecord salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", salary=" + salary +
                '}';
    }
}
