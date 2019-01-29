package collector;

import data.DataLoader;
import data.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();
        List<Person> people = dataLoader.createPeople();

        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(peopleByAge);
    }
}
