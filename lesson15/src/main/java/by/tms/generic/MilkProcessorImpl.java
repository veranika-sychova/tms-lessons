package by.tms.generic;

public class MilkProcessorImpl implements ProductProcessor<Milk> {

    @Override
    public void create(Milk product) {
        System.out.println("I'm creating milk");
    }

    @Override
    public void order(Milk product) {
        System.out.println("I'm ordering milk");
    }

    @Override
    public void delete(Milk product) {
        System.out.println("I'm deleting milk");
    }
}
