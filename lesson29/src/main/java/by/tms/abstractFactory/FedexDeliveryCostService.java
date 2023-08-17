package by.tms.abstractFactory;

public class FedexDeliveryCostService implements DeliveryCostService {

    @Override
    public void calculateCost() {
        System.out.println("Fedex cost is 150$");
    }
}
