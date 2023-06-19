package by.tms.lesson8.homework2;

public class Surgeon extends Doctor {

    public Surgeon(String name, String specialization, String gender, int experience) {
        super(name, specialization, gender, experience);
    }

    @Override
    public void treat(){
        System.out.println("Treatment plan from surgeon: examine the patient, do a bones X-ray, prescribe physiotherapy and medication");
    }
}
