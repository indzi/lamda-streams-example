package introduction;

import data.DataLoader;

import java.util.List;

public class PickElements {

    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();

        List<String> elements = dataLoader.createElementList();
        elements.stream()
               .filter((element) -> element.startsWith("N"))
                .forEach((element) -> System.out.println(element));
    }


}
