package by.tms.xml.service;

import by.tms.xml.domain.Couple;

import java.util.*;

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
                t[j] = ((int)(i / coupleList.get(j).getSpeed()*100))/100;
                System.out.println("The couple " + coupleList.get(j) + " has finished " + i + " loops in " + t[j]);
            }
        }

        double min = Arrays.stream(t)
                .min()
                .getAsDouble();

        System.out.println(min);

        int indexOfMin = Arrays.binarySearch(t, min);
        System.out.println(indexOfMin);

        System.out.println("The couple " + coupleList.get(indexOfMin) + " won");

        if (this.coupleId == coupleList.get(indexOfMin).getId()){
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }


    }

    @Override
    public String toString() {
        return "RaceServiceImpl{" +
                "coupleList=" + coupleList +
                '}';
    }
}
