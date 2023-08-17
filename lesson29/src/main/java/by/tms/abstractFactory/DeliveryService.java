package by.tms.abstractFactory;

public class DeliveryService {

    public void handle(DeliveryAbstractFactory factory){
        factory.getCostService().calculateCost();
        factory.getFulfillmentService().send();
    }

}
