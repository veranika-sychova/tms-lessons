package by.tms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    private String login;
    private String name;
    private int age;
    private String gender;
    private List<Child> kids = new ArrayList<>();

    public Person(String login, String name, int age, String gender, List<Child> kids) {
        this.login = login;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.kids = kids;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public List<Child> getKids() {
        return kids;
    }

    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", kids=" + Arrays.toString(kids.toArray()) +
                '}';
    }
}
