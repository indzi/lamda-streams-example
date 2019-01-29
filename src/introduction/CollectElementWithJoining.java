package introduction;

import data.DataLoader;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class CollectElementWithJoining {

    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();

        List<String> elements = dataLoader.createElementList();

        String list = elements.stream()
                .filter((element) -> element.startsWith("N"))
                .collect(joining(", "));

        System.out.println(list);
    }
}
