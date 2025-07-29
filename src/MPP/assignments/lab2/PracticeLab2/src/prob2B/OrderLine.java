package MPP.assignments.lab2.PracticeLab2.src.prob2B;

public class OrderLine {
    private Order order;

    public OrderLine(Order order) {
        this.order = order;
        order.addOrderLines(this);
    }

    public Order getOrder() {
        return order;
    }
}

