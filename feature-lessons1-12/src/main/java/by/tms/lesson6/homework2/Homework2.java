package by.tms.lesson6.homework2;

public class Homework2 {
    public static void main(String[] args) {

        Computer computer1 = new Computer(100, "Acer");
        System.out.println("Info about computer 1: ");
        computer1.showComputerInfo();

        Computer computer2 = new Computer(250, "HP", new RAM(16,"AbcRam" ), new HDD(20,"abcHdd", "embedded"));
        System.out.println("Info about computer 2: ");
        computer2.showComputerInfo();
    }
}
