package by.tms.homework;

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

        System.out.println(director1.getIncome());

        System.out.println(engineer3.getIncome());

        System.out.println(EmployeeService.hasPrimarySubordinate(director2, "Engineer5"));

        System.out.println(EmployeeService.hasSubordinate(director1, "Engineer9"));

        System.out.println(director1);
    }
}
