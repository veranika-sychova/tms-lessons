package by.tms.lesson8.homework1;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling");
    }

    public void receiveCall(String callerName, int callerNumber) {
        System.out.println(callerName + " " + callerNumber + " is calling");
    }

    public void sendMessage(String... recipientMumber) {
        System.out.println("Message will be sent to numbers: ");
        for (int i = 0; i < recipientMumber.length; i++) {
            System.out.print(" " + recipientMumber[i]);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getNumber() {
        return number;
    }

}
