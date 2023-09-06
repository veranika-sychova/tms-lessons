package by.tms.service;

import by.tms.domain.Couple;
import by.tms.domain.Horse;
import by.tms.domain.Rider;

public interface RaceService {

    void listCouples();

    void betOnCouple(Integer id);

    void startRace();

}
