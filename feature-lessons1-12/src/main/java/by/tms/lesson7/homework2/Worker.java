package by.tms.lesson7.homework2;

public class Worker implements Position {

    private String nameOfPosition;

    public Worker() {
    }

    public Worker(String name) {
        this.nameOfPosition = name;
    }

    @Override
    public String showPosition() {
        return nameOfPosition;
    }
}
