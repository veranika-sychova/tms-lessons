package by.tms.lesson9.homework1;

public class VectorXYZ extends VectorXY {

    private double z;
    private final String vectorInfo;

    public VectorXYZ(double x, double y, double z) {
        super(x, y);
        this.z = z;
        vectorInfo = "This is a vector for a 3D coordinate system, where x = " + x + ", y = " + y + "z = " + z + ".";

    }

    @Override
    public double getVectorLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double scalarMultiplyBy(VectorXYZ vectorXYZ) {
        return this.x * vectorXYZ.getX() + this.y * vectorXYZ.getY() + this.z * vectorXYZ.getZ();
    }

    public VectorXYZ add(VectorXYZ vectorXYZ) {
        return new VectorXYZ(this.x + vectorXYZ.getX(), this.y + vectorXYZ.getY(), this.z + vectorXYZ.getZ());
    }

    public VectorXYZ subtract(VectorXYZ vectorXYZ) {
        return new VectorXYZ(this.x - vectorXYZ.getX(), this.y - vectorXYZ.getY(), this.z - vectorXYZ.getZ());
    }

    @Override
    public String toString() {
        return "VectorXYZ{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }


    public void showInfo() {
        System.out.println(vectorInfo);
    }
    public double getZ() {
        return z;
    }
}
