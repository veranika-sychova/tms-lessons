package by.tms;

import javax.persistence.Embeddable;

@Embeddable
public class Price {

    private double price;
    private String currency;

    public Price() {
    }

    public Price(double price, String currency) {
        this.price = price;
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
