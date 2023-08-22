package by.tms.observer;

import java.util.Observable;
import java.util.Observer;

public class InventoryService implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Product stocks are being held");
    }
}
