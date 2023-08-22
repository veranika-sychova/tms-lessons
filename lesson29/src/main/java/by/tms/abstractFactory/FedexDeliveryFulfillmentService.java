package by.tms.abstractFactory;

public class FedexDeliveryFulfillmentService implements DeliveryFulfillmentService {

    @Override
    public void send() {
        System.out.println("Fedex sent package");
    }
}
