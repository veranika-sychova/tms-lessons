package by.tms.lesson8.homework2;

public abstract class Doctor {

    protected String name;
    protected String specialization;
    protected String gender;
    protected int experienceInYears;

    public Doctor() {
    }

    public Doctor(String name, String specialization, String gender, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.gender = gender;
        this.experienceInYears = experience;
    }

    public abstract void treat();
}
