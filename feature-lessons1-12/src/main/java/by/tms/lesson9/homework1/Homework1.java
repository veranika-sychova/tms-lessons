package by.tms.lesson9.homework1;

import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {

        VectorXY vectorXY = new VectorXY(5, 10);
        VectorXY vectorXY1 = new VectorXY(2, 6);

        VectorXYZ vectorXYZ = new VectorXYZ(3, 7, 5);
        VectorXYZ vectorXYZ1 = new VectorXYZ(5, 2, 9);

        System.out.println(vectorXY.getVectorLength());
        System.out.println(vectorXYZ.getVectorLength());

        System.out.println(vectorXY.scalarMultiplyBy(vectorXY1));
        System.out.println(vectorXYZ.scalarMultiplyBy(vectorXYZ1));

        System.out.println(vectorXY.add(vectorXY1));

        System.out.println(vectorXYZ.subtract(vectorXYZ1));

        VectorXY[] arrayXY = generateRandomVectors(1);
        for (int i = 0; i < arrayXY.length; i++) {
            arrayXY[i].showInfo();
        }

        vectorXY.compareTo(vectorXY1);
        vectorXYZ.compareTo(vectorXYZ1);

        vectorXY.showInfo();
        vectorXYZ.showInfo();
    }

    public static VectorXY[] generateRandomVectors(int n) {
        Random random = new Random(5);
        VectorXY[] array = new VectorXY[n];
        for (int i = 0; i < n; i++) {
            array[i] = new VectorXY(random.nextDouble(), random.nextDouble());
        }
        return array;
    }
}
