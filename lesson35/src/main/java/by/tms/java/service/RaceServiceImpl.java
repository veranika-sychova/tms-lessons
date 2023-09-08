package by.tms.java.service;

import by.tms.java.domain.Couple;

import java.util.Arrays;
import java.util.List;

public class RaceServiceImpl implements RaceService {

    private List<Couple> coupleList;
    private Integer coupleId;

    public RaceServiceImpl() {
    }

    public List<Couple> getCoupleList() {
        return coupleList;
    }

    public void setCoupleList(List<Couple> coupleList) {
        this.coupleList = coupleList;
    }

    @Override
    public void listCouples() {
        System.out.println(coupleList.toString());
    }

    @Override
    public void betOnCouple(Integer id) {
        this.coupleId = id;
        System.out.println("Your bet is accepted");
    }

    @Override
    public void startRace() {
        double[] t = new double[coupleList.size()];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < coupleList.size(); j++) {
                t[j] = ((int) (i / coupleList.get(j).getSpeed() * 100)) / 100;
                System.out.println("The couple " + coupleList.get(j) + " has finished " + i + " loops in " + t[j]);
            }
        }

        int indexOfMin = indexOfMinValue(t);
        System.out.println(indexOfMin);

        System.out.println("The couple " + coupleList.get(indexOfMin) + " won");

        if (this.coupleId == coupleList.get(indexOfMin).getId()) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }

    private int indexOfMinValue(double[] array) {

        int minIndex = 0;
        double minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    @Override
    public String toString() {
        return "RaceServiceImpl{" +
                "coupleList=" + coupleList +
                '}';
    }
}
