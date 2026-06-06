package Enumerator;

enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

public class Order {
    private int orderid;
    private OrderStatus status;

    public Order(int orderid, OrderStatus status) {
        this.orderid = orderid;
        this.status = status;
    }

    public void checkstatus(){
        System.out.println(orderid);
        System.out.println(status);
    }

    public static void main(String[] args) {

        Order order1 = new Order(101,OrderStatus.PENDING);
        Order order2 = new Order(102,OrderStatus.CANCELLED);

        order1.checkstatus();
        order2.checkstatus();
    }
}

/*The enum acts like a list of valid statuses. Every Order object stores one of those valid statuses,
which prevents invalid data and typing mistakes. This is why enums are commonly used for statuses,
roles, priorities, and states in real applications.*/
