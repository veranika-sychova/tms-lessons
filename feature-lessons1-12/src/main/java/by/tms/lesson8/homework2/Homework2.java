package by.tms.lesson8.homework2;

public class Homework2 {
    public static void main(String[] args) {

        Patient vasya = new Patient("vasya", 55, "male", "toothache");
        vasya.setTreatmentPlan(new TreatmentPlan(3));

        Clinic clinic = new Clinic();

        Doctor doctor = clinic.findDoctor(vasya.getTreatmentPlan());
        doctor.treat();
    }
}
