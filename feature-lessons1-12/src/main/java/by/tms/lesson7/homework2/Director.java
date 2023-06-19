package by.tms.lesson7.homework2;

public class Director implements Position {

    private String nameOfPosition;

    public Director() {
    }

    public Director(String name) {
        this.nameOfPosition = name;
    }

    @Override
    public String showPosition() {
        return nameOfPosition;
    }
}
