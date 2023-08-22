package by.tms.decorator;

import java.util.SortedMap;

public class SmsServiceImpl implements SmsService{

    @Override
    public void sendMessage(String from, String to, String text) {
        System.out.println("Message is being sent from " + from + " to " + to + " with following text: " + text);
    }
}
