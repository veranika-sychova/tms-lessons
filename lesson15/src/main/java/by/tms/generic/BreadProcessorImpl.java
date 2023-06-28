package by.tms.generic;

public class BreadProcessorImpl implements ProductProcessor<Bread>{

    @Override
    public void create(Bread product) {
        System.out.println("I'm creating bread");
    }

    @Override
    public void order(Bread product) {
        System.out.println("I'm ordering bread");
    }

    @Override
    public void delete(Bread product) {
        System.out.println("I'm deleting bread");
    }
}
