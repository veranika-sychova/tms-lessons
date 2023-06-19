package by.tms.lesson7.homework2;

public class Accountant implements Position {

    private String nameOfPosition;

    public Accountant() {
    }

    public Accountant(String name) {
        this.nameOfPosition = name;
    }

    @Override
    public String showPosition() {
        return nameOfPosition;
    }
}
