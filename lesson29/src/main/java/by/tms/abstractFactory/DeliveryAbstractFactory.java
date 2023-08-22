package by.tms.abstractFactory;

public interface DeliveryAbstractFactory {

    DeliveryCostService getCostService();

    DeliveryFulfillmentService getFulfillmentService();
}
