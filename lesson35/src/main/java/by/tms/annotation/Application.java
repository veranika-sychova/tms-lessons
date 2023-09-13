package by.tms.annotation;


import by.tms.annotation.domain.Couple;
import by.tms.annotation.service.RaceServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("by.tms.annotation");

        RaceServiceImpl raceService = context.getBean(RaceServiceImpl.class);
        raceService.listCouples();

        System.out.println("Choose the couple");
        raceService.betOnCouple(new Scanner(System.in).nextInt());

        raceService.startRace();

    }
}
