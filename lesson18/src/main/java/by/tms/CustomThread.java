package by.tms;

public class CustomThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 1000000 ; i++) {
            if (i % 100000 == 0){
                System.out.println(this.getName() + " thread is in progress " + i);
            }
        }
        System.out.println(this.getName() + " is done");
    }
}
