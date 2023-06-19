package by.tms.lesson8.homework2;

public class Therapist extends Doctor {

    public Therapist(String name, String specialization, String gender, int experience) {
        super(name, specialization, gender, experience);
    }

    @Override
    public void treat(){
        System.out.println("Treatment plan from therapist: evaluate the general state of health, examine the patient, give a referral for tests, refer to a highly specialized specialist if necessary.");
    }
}
