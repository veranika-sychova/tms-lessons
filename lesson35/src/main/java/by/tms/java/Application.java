package by.tms.java;


import by.tms.java.service.RaceServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("by.tms.java");

        RaceServiceImpl raceService = context.getBean("raceService", RaceServiceImpl.class);
        raceService.listCouples();

        System.out.println("Choose the couple");
        raceService.betOnCouple(new Scanner(System.in).nextInt());

        raceService.startRace();

    }
}
