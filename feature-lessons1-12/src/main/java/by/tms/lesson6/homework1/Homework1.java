package by.tms.lesson6.homework1;

public class Homework1 {
    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard();
        creditCard1.setAccountNumber("by456asd234");
        creditCard1.setBalance(200);

        CreditCard creditCard2 = new CreditCard();
        creditCard2.setAccountNumber("by557re123");
        creditCard2.setBalance(100);

        CreditCard creditCard3 = new CreditCard();
        creditCard3.setAccountNumber("by456lgj705");
        creditCard3.setBalance(500);

        creditCard1.addMoney(100);
        creditCard1.showBalance();

        creditCard2.addMoney(300);
        creditCard2.showBalance();

        creditCard3.withdrawMoney(600);
        creditCard3.showBalance();
    }
}
