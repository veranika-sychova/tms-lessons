package by.tms.lesson7.homework1;

public class Circle extends Figure {

    private double diameter;

    public Circle() {
    }

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    private double calculateRadius() {
        return this.diameter / 2;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * calculateRadius() * calculateRadius();
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * calculateRadius();
    }

}
