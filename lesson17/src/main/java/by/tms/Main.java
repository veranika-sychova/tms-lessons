package by.tms;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);

        List<Integer> distinctValues = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctValues);

        List<Integer> evenValues = list.stream()
                .filter(number -> number % 2 == 0)
                .filter(number -> number >= 7 && number <= 17)
                .collect(Collectors.toList());

        System.out.println(evenValues);

        List<Integer> doubledNumbers = list.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        System.out.println(doubledNumbers);

        List<Integer> firstFourElements = list.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());

        System.out.println(firstFourElements);

        long count = list.stream()
                .count();

        System.out.println(count);

        OptionalDouble average = list.stream()
                .mapToInt(result -> result)
                .average();

        System.out.println(average);


    }

}
