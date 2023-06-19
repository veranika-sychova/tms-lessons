package by.tms.homework;

public enum DirectorsJobType {

    CEO (500),
    Chief (400),
    Commercial(350),
    Technical(800);

    private final double coefficient;

    DirectorsJobType(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
