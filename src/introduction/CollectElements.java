package introduction;

import data.DataLoader;

import java.util.List;
import java.util.stream.Collectors;

public class CollectElements {

    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();

        List<String> elements = dataLoader.createElementList();
        elements.stream()
                .filter((element) -> element.startsWith("N"))
//                .collect(Collectors.toList())
                .collect(Collectors.toList())
                .stream()
                .forEach((collector) -> System.out.println(collector));


    }
}
