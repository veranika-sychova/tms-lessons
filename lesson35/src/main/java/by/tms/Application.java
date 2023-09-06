package by.tms;


import by.tms.domain.Couple;
import by.tms.domain.Horse;
import by.tms.service.RaceServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        RaceServiceImpl raceService = context.getBean("raceService", RaceServiceImpl.class);
        raceService.listCouples();


    }
}
