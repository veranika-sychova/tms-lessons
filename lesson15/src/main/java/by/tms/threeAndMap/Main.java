package by.tms.threeAndMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Director director1 = new Director("Petr", "Director1", "male", 7, DirectorsJobType.CEO);
        Director director2 = new Director("Lev", "Director2", "male", 3, DirectorsJobType.CEO);
        Director director3 = new Director(DirectorsJobType.Commercial);
        Director director4 = new Director("Roman", "Director4", "male", 3, DirectorsJobType.CEO);

        Engineer engineer1 = new Engineer(EngineerJobType.TechnologicalEngineer);
        Engineer engineer2 = new Engineer(EngineerJobType.DesignEngineer);
        Engineer engineer3 = new Engineer("Slava", "Engineer3", "male", 8, EngineerJobType.DesignEngineer);
        Engineer engineer4 = new Engineer("Maria", "Engineer4", "female", 5, EngineerJobType.TechnologicalEngineer);
        Engineer engineer5 = new Engineer("Olya", "Engineer5", "female", 3, EngineerJobType.TechnologicalEngineer);
        Engineer engineer6 = new Engineer(EngineerJobType.DevelopmentEngineer);
        Engineer engineer7 = new Engineer(EngineerJobType.DesignEngineer);
        Engineer engineer8 = new Engineer(EngineerJobType.TechnologicalEngineer);
        Engineer engineer9 = new Engineer("Ivan", "Engineer9", "male", 3, EngineerJobType.TechnologicalEngineer);

        director1.assignSubordinate(director2);
        director1.assignSubordinate(director3);
        director1.assignSubordinate(engineer1);
        director1.assignSubordinate(engineer2);

        director2.assignSubordinate(engineer3);
        director2.assignSubordinate(engineer4);

        director3.assignSubordinate(director4);
        director3.assignSubordinate(engineer5);
        director3.assignSubordinate(engineer6);

        director4.assignSubordinate(engineer7);
        director4.assignSubordinate(engineer8);
        director4.assignSubordinate(engineer9);


        // Testing ThreeSet >>>
        Set<Director> directorsSet = new TreeSet<>();
        directorsSet.add(director1);
        directorsSet.add(director2);
        directorsSet.add(director3);
        directorsSet.add(director4);

        System.out.println(directorsSet);

        //Testing Map >>>>>>

        List<Worker> workersList = new ArrayList<>();
        workersList.add(director1);
        workersList.add(director2);
        workersList.add(director3);
        workersList.add(director4);
        workersList.add(engineer1);
        workersList.add(engineer2);
        workersList.add(engineer3);
        workersList.add(engineer4);
        workersList.add(engineer5);
        workersList.add(engineer6);
        workersList.add(engineer7);
        workersList.add(engineer8);
        workersList.add(engineer9);

        Map<String, Integer> workersMap = new HashMap<>();

        for (int i = 0; i < workersList.size(); i++) {
            if (workersList.get(i) instanceof Director) {
                if (!workersMap.containsKey("directors")) {
                    workersMap.put("directors", 1);
                } else {
                    workersMap.put("directors", workersMap.get("directors") + 1);
                }
            } else if (workersList.get(i) instanceof Engineer) {
                if (!workersMap.containsKey("engineers")) {
                    workersMap.put("engineers", 1);
                } else {
                    workersMap.put("engineers", workersMap.get("engineers") + 1);
                }
            }
        }

            System.out.println("There are " + workersMap.get("directors") + " directors");
            System.out.println("There are " + workersMap.get("engineers") + " engineers");


    }
}
