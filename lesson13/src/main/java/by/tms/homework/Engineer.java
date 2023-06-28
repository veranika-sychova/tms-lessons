package by.tms.homework;

public class Engineer extends Worker{

   private EngineerJobType type;

    public Engineer(EngineerJobType type) {
        this.type = type;
    }

    public Engineer(String firstMame, String lastName, String gender, int workExperienceInYears, EngineerJobType type) {
        super(firstMame, lastName, gender, workExperienceInYears);
        this.type = type;
    }

    @Override
    public double getCoefficient() {
        return type.getCoefficient();
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "last name=" + getLastName() +
                " experience=" + getWorkExperienceInYears() +
                " income=" + getIncome() +
                "}}";
    }
}
