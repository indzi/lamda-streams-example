package collector;

import data.DataLoader;
import data.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectArrayList {

        public static void main(String[] args) {
            DataLoader dataLoader = new DataLoader();
            List<Person> people = dataLoader.createPeople();

           ArrayList peopleAboveTwenty = people.stream()
                    .filter((person -> person.getAge() > 20))
                    .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
            System.out.println(peopleAboveTwenty);
        }
}
