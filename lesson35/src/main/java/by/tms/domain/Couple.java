package by.tms.domain;

import java.util.Random;

public class Couple {

    private Integer id;
    private Rider rider;
    private Horse horse;
    private double speed;

    public Couple() {
        this.speed = new Random().nextDouble();
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Couple{" +
                "id=" + id +
                ", rider=" + rider +
                ", horse=" + horse +
                ", speed=" + speed +
                '}';
    }
}
