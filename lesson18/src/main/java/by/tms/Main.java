package by.tms;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new CustomThread();
        t1.setName("T1");

        Thread t2 = new CustomThread();
        t2.setName("T2");

        Thread t3 = new CustomThread();
        t3.setName("T3");

        t3.start();
        t3.join();

        t2.start();
        t2.join();

        t1.start();
    }

}
