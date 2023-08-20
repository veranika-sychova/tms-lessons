package by.tms.template;

import by.tms.template.model.Order;
import by.tms.template.model.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class DeliveryTemplate {

    private List<Order> db = new ArrayList<>();

    public final void deliver(Product product) {
        Order order = placeOrder(product);
        record(order);
        calculateCost(order);
    }

    public Order placeOrder(Product product){
        Order order = new Order(product);
        System.out.println(product + " is being ordered");
        return order;
    }

    public void record(Order order){
        db.add(order);
        System.out.println("Saved");
    }

    public abstract void calculateCost(Order order);


}
