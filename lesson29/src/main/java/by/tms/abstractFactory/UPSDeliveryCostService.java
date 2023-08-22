package by.tms.abstractFactory;

public class UPSDeliveryCostService implements DeliveryCostService {

    @Override
    public void calculateCost() {
        System.out.println("UPS cost is 200$");
    }
}
