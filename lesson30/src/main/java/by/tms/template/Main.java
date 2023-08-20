package by.tms.template;

import by.tms.template.DeliveryTemplate;
import by.tms.template.Fedex;
import by.tms.template.UPS;
import by.tms.template.model.Product;
import by.tms.template.model.ProductType;

public class Main {
    public static void main(String[] args) {

        Product jeans = new Product("1", "jeans", ProductType.CLOTHES);
        Product pizza = new Product("2", "pizza", ProductType.FOOD);
        Product HarryPotter = new Product("3", "HP", ProductType.BOOKS);

        DeliveryTemplate ups = new UPS();
        DeliveryTemplate fedex = new Fedex();

        ups.deliver(jeans);
        ups.deliver(HarryPotter);

        fedex.deliver(pizza);
        
        
    }
}
