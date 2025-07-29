package SWE.lesson5.record;

import SWE.lesson5.record.model.Employee;
import SWE.lesson5.record.model.MoneyRecord;

import java.time.LocalDate;

public class HRMgmtApp {
    public static void main(String[] args) {
        var anna = new Employee(
                1,
                "Anna",
                "Smith",
                LocalDate.of(1991, 11, 10),
                new MoneyRecord("USD", 2000.0));
        anna.setSalary(new MoneyRecord("USD", 3000.0));
        System.out.println(anna);
    }
}
