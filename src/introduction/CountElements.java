package introduction;

import data.DataLoader;

import java.util.List;

public class CountElements {

    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();

        List<String> elements = dataLoader.createElementList();
        Long count = elements.stream()
                .filter((element) -> element.startsWith("N"))
                .count();

        System.out.println(count);
    }
}
