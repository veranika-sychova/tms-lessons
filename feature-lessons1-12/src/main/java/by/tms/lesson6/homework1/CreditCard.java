package by.tms.lesson6.homework1;

public class CreditCard {

    private String accountNumber;
    private double balance;

    public CreditCard() {

    }

    public void addMoney(double balance) {
        this.balance += balance;
    }

    public boolean withdrawMoney(double balance) {
        if (balance > this.balance) {
            System.out.println("The requested amount is not available.Try again.");
            return false;
        } else {
            showBalance();
            this.balance -= balance;
            return true;
        }
    }

    public void showBalance() {
        System.out.println("The balance of the credit card " + accountNumber + " is: " + this.balance);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
