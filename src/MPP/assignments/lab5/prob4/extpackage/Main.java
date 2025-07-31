package MPP.assignments.lab5.prob4.extpackage;

import java.time.LocalDate;

import MPP.assignments.lab5.prob4.CustOrderFactory;
import MPP.assignments.lab5.prob4.Customer;
import MPP.assignments.lab5.prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Leonardo");
		Order order = CustOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.printf("Customer Name:" + cust.getCustomerName()+" \nOrdered: "+ cust.getOrders());
	}
}

		
