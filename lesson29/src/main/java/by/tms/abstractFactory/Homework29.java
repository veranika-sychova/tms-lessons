package by.tms.abstractFactory;

public class Homework29 {
    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.handle(new UPSFactory());
    }
}
