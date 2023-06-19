package by.tms.lesson7.homework2;

public class Homework2 {
    public static void main(String[] args) {

        Position position = new Accountant("Accountant");
        Position position1 = new Director("Director");
        Position position2 = new Worker("Worker");

        System.out.println(position.showPosition());
        System.out.println(position1.showPosition());
        System.out.println(position2.showPosition());

    }
}
