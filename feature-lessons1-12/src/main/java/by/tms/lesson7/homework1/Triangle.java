package by.tms.lesson7.homework1;

public class Triangle extends Figure {

    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateSquare() {
        double halfPer = calculatePerimeter() / 2;
        double h = 2 / side3 * Math.sqrt(halfPer * (halfPer - side3) * (halfPer - side2) * (halfPer - side1));
        return h * side3 / 2;
    }
}
