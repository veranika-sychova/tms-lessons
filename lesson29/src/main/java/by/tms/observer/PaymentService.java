package by.tms.observer;

import java.util.Observable;
import java.util.Observer;

public class PaymentService implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Payment is being charged");
    }
}
