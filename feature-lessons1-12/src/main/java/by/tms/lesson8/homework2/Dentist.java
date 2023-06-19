package by.tms.lesson8.homework2;

public class Dentist extends Doctor {

    public Dentist(String name, String specialization, String gender, int experience) {
        super(name, specialization, gender, experience);
    }

    @Override
    public void treat(){
        System.out.println("Treatment plan from dentist: examine the patient, take the necessary X-rays, perform the necessary treatment procedures, remind about oral hygiene.");
    }
}
