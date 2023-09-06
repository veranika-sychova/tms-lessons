package by.tms.service;

import by.tms.domain.Couple;
import by.tms.domain.Horse;
import by.tms.domain.Rider;

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

    }

    @Override
    public String toString() {
        return "RaceServiceImpl{" +
                "coupleList=" + coupleList +
                '}';
    }
}
