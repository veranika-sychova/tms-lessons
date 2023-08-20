package by.tms.template;

import by.tms.template.model.Order;
import by.tms.template.model.ProductType;

public class UPS extends DeliveryTemplate {

    @Override
    public void calculateCost(Order order) {
        if (order.getProduct().getType().equals(ProductType.FOOD)){
            System.out.println("10$");
        } else {
            System.out.println("5$");
        }
    }
}
