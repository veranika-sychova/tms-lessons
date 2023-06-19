package by.tms.lesson9.homework2;

import java.util.Arrays;

public class Vector {

    private double[] coordinates;
    private final String vectorInfo;

    public Vector(double... number) {
        coordinates = number;
        if (number.length == 2) {
            vectorInfo = "This is a vector, where x = " + number[0] + ", y = " + number[1] + ".";
        } else if (number.length == 3) {
            vectorInfo = "This is a vector, where x = " + number[0] + ", y = " + number[1] + ", z = " + number[2] + ".";
        } else {
            System.out.println("Wrong number of coordinates");
            vectorInfo = null;
        }
    }

    public double getVectorLength() {
        double sum = 0;
        for (int i = 0; i < coordinates.length; i++) {
            sum += Math.pow(coordinates[i], 2);
        }
        return Math.sqrt(sum);
    }

    public double scalarMultiplyBy(Vector vector) {
        double sumScalar = 0;
        for (int i = 0; i < coordinates.length; i++) {
            sumScalar += coordinates[i] * vector.coordinates[i];
        }
        return sumScalar;
    }

    public Vector add(Vector vector) {
        double[] resultCoordinates = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            resultCoordinates[i] = coordinates[i] + vector.coordinates[i];
        }
       return new Vector(resultCoordinates);
    }

    public Vector subtract(Vector vector) {
        double[] resultCoordinates = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            resultCoordinates[i] = coordinates[i] - vector.coordinates[i];
        }
        return new Vector(resultCoordinates);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "coordinates=" + Arrays.toString(coordinates) +
                '}';
    }

    public void showInfo() {
        System.out.println(vectorInfo);
    }


    public void compareTo(Vector vector) {
        if (this.getVectorLength() > vector.getVectorLength()) {
            System.out.println("Modulus of vector" + this + "is greater than the modulus of the vector " + vector);
        } else if (this.getVectorLength() < vector.getVectorLength()) {
            System.out.println("Modulus of vector" + this + "is less than the modulus of the vector " + vector);
        } else {
            System.out.println("Modulus of vectors are equal.");
        }
    }

    public double[] getCoordinates() {
        return coordinates;
    }
}
