package by.tms.lesson6.homework3;

public class Homework3 {
    public static void main(String[] args) {
        ATM atm = new ATM(5,4,3);

        System.out.println("Total amount of money is " + atm.calculateMoney());

        atm.addMoney(100);
        atm.addMoney(20);
        System.out.println("Total amount of money is " + atm.calculateMoney());

       System.out.println(atm.withdrawMoney(200));
    }
}
