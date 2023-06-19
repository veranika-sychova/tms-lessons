package by.tms.lesson9.homework1;

public class VectorXY {

    protected double x;
    protected double y;

    protected final String vectorInfo;

    public VectorXY(double x, double y) {
        this.x = x;
        this.y = y;
        vectorInfo = "This is a vector for a 2D coordinate system, where x = " + x + ", y = " + y + ".";
    }

    public double getVectorLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }


    public double scalarMultiplyBy(VectorXY vectorXY) {
        return this.x * vectorXY.getX() + this.y * vectorXY.getY();
    }

    public VectorXY add(VectorXY vectorXY) {
        return new VectorXY(this.x + vectorXY.getX(), this.y + vectorXY.getY());
    }

    public VectorXY subtract(VectorXY vectorXY) {
        return new VectorXY(this.x - vectorXY.getX(), this.y - vectorXY.getY());
    }

    @Override
    public String toString() {
        return "VectorXY{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void showInfo() {
        System.out.println(vectorInfo);
    }

    public void compareTo(VectorXY vectorXY) {
        if (this.getVectorLength() > vectorXY.getVectorLength()) {
            System.out.println("Modulus of vector" + this + "is greater than the modulus of the vector " + vectorXY);
        } else if (this.getVectorLength() < vectorXY.getVectorLength()) {
            System.out.println("Modulus of vector" + this + "is less than the modulus of the vector " + vectorXY);
        } else {
            System.out.println("Modulus of vectors are equal.");
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
