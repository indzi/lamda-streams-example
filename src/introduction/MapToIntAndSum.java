package introduction;

import data.DataLoader;

import java.util.List;

public class MapToIntAndSum {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();

        List<String> elements = dataLoader.createElementList();

        int totalChars = elements.stream()
                .mapToInt((element) -> element.length())
                .sum();
        //.max
        //.min
        //.average

        System.out.println("The sum of all the characters of the element list is  " + totalChars);
    }
}
