package by.tms.lesson6.homework3;

public class ATM {

    private int numberOf20;
    private int numberOf50;
    private int numberOf100;

    public ATM() {
    }

    public void addMoney(int addDenomination) {
        if (addDenomination == 20) {
            this.numberOf20 ++;
        } else if (addDenomination == 50) {
            this.numberOf50 ++;
        } else if (addDenomination == 100) {
            this.numberOf100 ++;
        } else {
            System.out.println("Wrong addDenomination!");
        }
    }

    public int calculateMoney() {
        return numberOf20 * 20 + numberOf50 * 50 + numberOf100 * 100;
    }

    public boolean withdrawMoney(int sum) {
        int desiredNumberOf100 = sum / 100;
        if (desiredNumberOf100 >= numberOf100) {
            desiredNumberOf100 = numberOf100;
        }
        sum = sum - desiredNumberOf100 * 100;

        int desiredNumberOf50 = sum / 50;
        if (desiredNumberOf50 >= numberOf50) {
            desiredNumberOf50 = numberOf50;
        }
        sum = sum - desiredNumberOf50 * 50;

        int desiredNumberOf20 = sum / 20;
        if (desiredNumberOf20 >= numberOf20) {
            desiredNumberOf20 = numberOf20;
        }
        sum = sum - desiredNumberOf20 * 20;

        if (sum > 0) {
            return false;
        } else {
            numberOf100 -= desiredNumberOf100;
            numberOf50 -= desiredNumberOf50;
            numberOf20 -= desiredNumberOf20;
            System.out.println("100: " + desiredNumberOf100 + " 50: " + desiredNumberOf50 + " 20: " + desiredNumberOf20);
            return true;
        }
    }

    public ATM(int numberOf20, int numberOf50, int numberOf100) {
        this.numberOf20 = numberOf20;
        this.numberOf50 = numberOf50;
        this.numberOf100 = numberOf100;
    }
}

