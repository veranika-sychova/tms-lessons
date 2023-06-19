package by.tms.lesson8.homework2;

public class Clinic {

    public Doctor findDoctor(TreatmentPlan treatmentPlan) {
        if (treatmentPlan.getCode() == 1) {
            return new Surgeon("Alan", "surgeon", "male", 12);
        } else if (treatmentPlan.getCode() == 2) {
            return new Dentist("Ben", "dentist", "male", 33);
        } else {
            return new Therapist("Din", "therapist", "male", 20);
        }
    }

}
