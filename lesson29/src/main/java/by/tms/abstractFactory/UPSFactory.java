package by.tms.abstractFactory;

public class UPSFactory implements DeliveryAbstractFactory {

    @Override
    public DeliveryCostService getCostService() {
        return new UPSDeliveryCostService();
    }

    @Override
    public DeliveryFulfillmentService getFulfillmentService() {
        return new UPSDeliveryFulfillmentService();
    }
}
