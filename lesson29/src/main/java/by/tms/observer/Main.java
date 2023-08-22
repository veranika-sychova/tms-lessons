package by.tms.observer;

public class Main {
    public static void main(String[] args) {

        Order order = new Order("42", "initial");

        order.addObserver(new InventoryService());
        order.addObserver(new PaymentService());

        order.setStatus("placed");

    }
}
