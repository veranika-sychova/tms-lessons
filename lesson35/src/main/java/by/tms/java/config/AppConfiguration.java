package by.tms.java.config;

import by.tms.java.domain.Couple;
import by.tms.java.domain.Horse;
import by.tms.java.domain.Rider;
import by.tms.java.service.RaceService;
import by.tms.java.service.RaceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfiguration {

    @Bean
    public RaceService raceService() {
        RaceServiceImpl raceService = new RaceServiceImpl();
        List<Couple> coupleList = new ArrayList<>();
        coupleList.add(couple1());
        coupleList.add(couple2());
        coupleList.add(couple3());
        raceService.setCoupleList(coupleList);
        return raceService;
    }

    @Bean
    public Couple couple1() {
        Couple couple = new Couple();
        couple.setId(1);
        couple.setHorse(horse1());
        couple.setRider(rider1());
        return couple;
    }

    @Bean
    public Couple couple2() {
        Couple couple = new Couple();
        couple.setId(2);
        couple.setHorse(horse2());
        couple.setRider(rider2());
        return couple;
    }

    @Bean
    public Couple couple3() {
        Couple couple = new Couple();
        couple.setId(3);
        couple.setHorse(horse3());
        couple.setRider(rider3());
        return couple;
    }

    @Bean
    public Horse horse1() {
        Horse horse = new Horse();
        horse.setId(1);
        horse.setAge(11);
        horse.setName("Horse1");
        horse.setColor("Black");
        return horse;
    }

    @Bean
    public Horse horse2() {
        Horse horse = new Horse();
        horse.setId(2);
        horse.setAge(9);
        horse.setName("Horse2");
        horse.setColor("White");
        return horse;
    }

    @Bean
    public Horse horse3() {
        Horse horse = new Horse();
        horse.setId(3);
        horse.setAge(5);
        horse.setName("Horse3");
        horse.setColor("Brown");
        return horse;
    }

    @Bean
    public Rider rider1() {
        Rider rider = new Rider();
        rider.setId(1);
        rider.setExperience(5);
        rider.setGender("male");
        rider.setName("Bob");
        return rider;
    }

    @Bean
    public Rider rider2() {
        Rider rider = new Rider();
        rider.setId(2);
        rider.setExperience(8);
        rider.setGender("female");
        rider.setName("Lola");
        return rider;
    }

    @Bean
    public Rider rider3() {
        Rider rider = new Rider();
        rider.setId(3);
        rider.setExperience(9);
        rider.setGender("male");
        rider.setName("Tom");
        return rider;
    }
}
