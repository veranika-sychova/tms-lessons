package by.tms.abstractFactory;

public class UPSDeliveryFulfillmentService implements DeliveryFulfillmentService {

    @Override
    public void send() {
        System.out.println("UPS sent package");
    }
}
