package by.tms.lesson8.homework1;

public class Homework1 {
    public static void main(String[] args) {

        Phone phone1 = new Phone("356747865", "E45U");
        Phone phone2 = new Phone("446436645", "4gl7");
        Phone phone3 = new Phone("432958353", "flk3", 44.5);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Anna");
        phone2.receiveCall("Din");
        phone3.receiveCall("Alan");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Bella", 594958048);

        phone1.sendMessage("543503535","34535235", "2323552");
    }
}
