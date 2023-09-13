package by.tms.xml;


import by.tms.xml.service.RaceServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        RaceServiceImpl raceService = context.getBean("raceService", RaceServiceImpl.class);
        raceService.listCouples();

        System.out.println("Choose the couple");
        raceService.betOnCouple(new Scanner(System.in).nextInt());

        raceService.startRace();

    }
}
