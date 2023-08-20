package by.tms.decorator;

public class Main {
    public static void main(String[] args) {

        SmsService service = new SmsServiceDecorator(new SmsServiceImpl());
        service.sendMessage("Kolya", "Vasya", "Hello, Vasya!");
        service.sendMessage("Petya", "Olya", "Hello, Olya!");
        service.sendMessage("Nastya", "Kira", "Hello, Kira!");

        ((SmsServiceDecorator)service).listAll();

    }
}
