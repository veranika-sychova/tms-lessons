package by.tms.decorator;

import by.tms.decorator.model.Message;

import java.util.ArrayList;
import java.util.List;

public class SmsServiceDecorator implements SmsService {

    private SmsService smsService;
    private List<Message> db = new ArrayList<>();

    public SmsServiceDecorator(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public void sendMessage(String from, String to, String text) {
        smsService.sendMessage(from, to, text);
        db.add(new Message(from, to, text));
    }

    public void listAll() {
        System.out.println(db);
    }
}
