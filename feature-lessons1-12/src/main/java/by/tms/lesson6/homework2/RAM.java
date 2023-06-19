package by.tms.lesson6.homework2;

public class RAM {

    private int capacity;
    private String name;

    public RAM() {
    }

    public RAM(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                '}';
    }
}
