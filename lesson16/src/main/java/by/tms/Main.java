package by.tms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Child child1 = new Child("child1", 10, "male");
        Child child2 = new Child("child2", 10, "male");
        Child child3 = new Child("child3", 5, "female");
        Child child4 = new Child("child4", 11, "female");

        List<Child> childList1 = new ArrayList<>();
        childList1.add(child1);
        childList1.add(child2);
        childList1.add(child3);

        List<Child> childList2 = new ArrayList<>();
        childList2.add(child4);

        Person person1 = new Person("login1", "Person1", 29, "male", childList1);
        Person person2 = new Person("login1", "Person1", 29, "female", childList2);

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);

        List<Person> male = people.stream()
                .filter(person -> person.getGender().equals("male"))
                .collect(Collectors.toList());

        System.out.println(male);

        List<Person> manyChildPersons = people.stream()
                .filter(person -> person.getKids().size() > 2)
                .collect(Collectors.toList());

        System.out.println(manyChildPersons);

        List<String> getKidsName = people.stream()
                .map(Person::getKids)
                .flatMap(Collection::stream)
                .filter(kid -> kid.getAge() < 6)
                .map(Child::getName)
                .collect(Collectors.toList());

        System.out.println(getKidsName);


        List<Person> femaleWithKids = people.stream()
                .filter(person -> person.getGender().equals("female"))
                .filter(Main::hasKidsUnder12)
                .collect(Collectors.toList());

        System.out.println(femaleWithKids);

        Set<Integer> kidsAge = people.stream()
                .map(Person::getKids)
                .flatMap(Collection::stream)
                .map(Child::getAge)
                .collect(Collectors.toSet());

        System.out.println(kidsAge);
    }

    public static boolean hasKidsUnder12 (Person person){
        return person.getKids().stream()
                .anyMatch(kid -> kid.getAge() < 12);
    }

}

