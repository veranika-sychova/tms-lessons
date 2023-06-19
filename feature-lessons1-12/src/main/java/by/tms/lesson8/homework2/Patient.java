package by.tms.lesson8.homework2;

public class Patient {

    private String name;
    private int age;
    private String gender;
    private String complaint;

    private TreatmentPlan treatmentPlan;

    public Patient(String name, int age, String gender, String complaint) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.complaint = complaint;
    }


    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan){
        this.treatmentPlan = treatmentPlan;
    }

}
