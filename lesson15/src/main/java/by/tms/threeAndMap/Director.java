package by.tms.threeAndMap;

import java.util.ArrayList;
import java.util.List;

public class Director extends Worker implements Comparable<Director> {

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
        return "Director{" +
                " income=" + getIncome() +
                "last name=" + getLastName() +
                " experience=" + getWorkExperienceInYears() +
                "}\n";
    }

    // Testing ThreeSet >>>
    @Override
    public int compareTo(Director o) {
        return Double.compare(o.getIncome(), this.getIncome());
    }

}
