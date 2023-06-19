package by.tms.homework;

public enum EngineerJobType {

    DesignEngineer(600),
    DevelopmentEngineer(800),
    TechnologicalEngineer(550);

    private final double coefficient;

    EngineerJobType(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
