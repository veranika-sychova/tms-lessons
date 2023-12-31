package by.tms.generic;

public class Main {
    public static void main(String[] args) {

        Milk milk = new Milk("brandMilk", 1000);
        ProductProcessor<Milk> milkMilkProcessor = new MilkProcessorImpl();

        milkMilkProcessor.create(milk);
        milkMilkProcessor.order(milk);
        milkMilkProcessor.delete(milk);

        Bread bread = new Bread("brandBread", 300);
        ProductProcessor<Bread> breadProcessor = new BreadProcessorImpl();

        breadProcessor.create(bread);
        breadProcessor.order(bread);
        breadProcessor.delete(bread);

    }
}
