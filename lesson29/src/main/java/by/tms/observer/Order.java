package by.tms.observer;

import java.util.Observable;

public class Order extends Observable {

    private String id;
    private String status;

    public Order(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
        if (status.equals("placed")){
            setChanged();
            notifyObservers();
        }
    }
}
