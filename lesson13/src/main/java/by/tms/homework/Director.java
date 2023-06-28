package by.tms.homework;

import java.util.ArrayList;
import java.util.List;

public class Director extends Worker {

    private DirectorsJobType type;
    private List<Worker> subordinates = new ArrayList<>();
    private static final int PREMIUM = 2;

    public Director(DirectorsJobType type) {
        this.type = type;
    }

    public Director(String firstMame, String lastName, String gender, int workExperienceInYears, DirectorsJobType type) {
        super(firstMame, lastName, gender, workExperienceInYears);
        this.type = type;
    }

    @Override
    public double getCoefficient() {
        return type.getCoefficient();
    }

    public void assignSubordinate(Worker worker) {
        subordinates.add(worker);
    }

    @Override
    public double getIncome() {
        return super.getIncome() + subordinates.size() * PREMIUM;
    }

    public List<Worker> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < subordinates.size(); i++) {
            builder.append(subordinates.get(i).toString()).append(";");
        }
        return "Director{" +
                "last name=" + getLastName() +
                " experience=" + getWorkExperienceInYears() +
                " income=" + getIncome() +
                ", subordinates={" + builder +
                "}}";
    }
}
