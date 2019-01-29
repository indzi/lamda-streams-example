package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataLoader {
    public static List<String> createElementList (){
        ArrayList<String> elements = new ArrayList<>();

        elements.add("Test");
        elements.add("Nest");
        elements.add("Best");
        elements.add("Fair");
        elements.add("Nose");
        elements.add("Nancy");
        elements.add("Fancy");

        return elements;
    }

    public List<String> createTwoNames () {
        ArrayList<String> names = new ArrayList<>();
        names.add("Indranil");
        names.add("Rajdeep");

        return names;
    }

    public List<Person> createPeople () {
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35));
        return people;
    }
}
