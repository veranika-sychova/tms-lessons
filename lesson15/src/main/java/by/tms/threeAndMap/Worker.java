package by.tms.threeAndMap;

public abstract class Worker {

    private String firstMame;
    private String lastName;
    private String gender;
    private int workExperienceInYears;

    public Worker() {
    }

    public Worker(String firstMame, String lastName, String gender, int workExperienceInYears) {
        this.firstMame = firstMame;
        this.lastName = lastName;
        this.gender = gender;
        this.workExperienceInYears = workExperienceInYears;
    }

    public double getIncome() {
        return getCoefficient() * (workExperienceInYears + 1);
    }

    public abstract double getCoefficient();

    public String getLastName() {
        return lastName;
    }

    public int getWorkExperienceInYears() {
        return workExperienceInYears;
    }
}
