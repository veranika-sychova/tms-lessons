package by.tms.lesson6.homework2;

public class HDD {

    private int capacity;
    private String name;
    private String type;

    public HDD() {
    }

    public HDD(int capacity, String name, String type) {
        this.capacity = capacity;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
