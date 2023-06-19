package by.tms.lesson9.homework2;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {

        Vector vector = new Vector(5, 10);
        Vector vector1 = new Vector(2, 6);

        Vector vector2 = new Vector(6, 1, 7);
        Vector vector3 = new Vector(8, 6, 5);

        System.out.println(vector.getVectorLength());
        System.out.println(vector2.getVectorLength());

        System.out.println(vector.scalarMultiplyBy(vector1));
        System.out.println(vector2.scalarMultiplyBy(vector3));

        System.out.println(vector.add(vector1));

        System.out.println(vector2.subtract(vector3));

        Vector[] array = generateRandomVectors(1);
        for (int i = 0; i < array.length; i++) {
            array[i].showInfo();
        }

        vector.compareTo(vector1);
        vector2.compareTo(vector3);

        vector.showInfo();
        vector2.showInfo();
    }

    public static Vector[] generateRandomVectors(int n) {
        Random random = new Random(5);
        Vector[] array = new Vector[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Vector(random.nextDouble(), random.nextDouble());
        }
        return array;
    }
}
