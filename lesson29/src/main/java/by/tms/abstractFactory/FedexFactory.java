package by.tms.abstractFactory;

public class FedexFactory implements DeliveryAbstractFactory {

    @Override
    public DeliveryCostService getCostService() {
        return new FedexDeliveryCostService();
    }

    @Override
    public DeliveryFulfillmentService getFulfillmentService() {
        return new FedexDeliveryFulfillmentService();
    }
}
