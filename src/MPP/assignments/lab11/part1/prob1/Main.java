package MPP.assignments.lab11.part1.prob1;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
	List<Order> orders;
	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderData();
		m.displayAllOrders();
		m.showAllOrderItems();

	}

	/**
	 * This method displays all OrderItems separately, apart from the owning Orders. Carry out this
	 * implementation (using the technique described in the slides) by embedding the Orders list in a
	 * Stream and using flatMap.
	 */
	private void showAllOrderItems() {
		System.out.println("\n==============\nAll order items:");
		//implement
		List<OrderItem> allItems = orders.stream()
			.flatMap(order -> order.getOrderItems().stream())
			.collect(Collectors.toList());
		System.out.println(allItems);
	}
	
	private void displayAllOrders() {
		System.out.println(orders);;
	}
	
	private void loadOrderData() {
		orders = new ArrayList<>();
		Order o = new Order(LocalDate.of(2011, 10, 5), "10-210", "1001", 2, 11);
		o.addOrderItem("1002", 1, 23);
		o.addOrderItem("1003", 1, 45);
		orders.add(o);
		
		o = new Order(LocalDate.of(2001, 11, 15), "11-220", "1015", 2, 33);
		o.addOrderItem("1016", 3, 15);
		o.addOrderItem("1017", 1, 22);
		o.addOrderItem("1018", 2, 19);
		o.addOrderItem("1019", 5, 9);
		orders.add(o);
		
		o = new Order(LocalDate.of(2011, 10, 5), "10-210", "1022", 1, 80);
		o.addOrderItem("1023", 1, 28);
		o.addOrderItem("1024", 1, 41);
		orders.add(o);
	}

}
