package collector;

import data.DataLoader;
import data.Person;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sort {

    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();
        List<Person> people = dataLoader.createPeople();
        final Function<Person, Integer> byAge = person -> person.getAge();

       final List<Person> peopleByAge = people.stream()
               .sorted(Comparator.comparing(byAge))
               .collect(Collectors.toList());


        System.out.println(peopleByAge);
    }
}
