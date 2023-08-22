package by.tms.template.model;

public class Order {

    private Product product;

    public Order(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product=" + product +
                '}';
    }
}
