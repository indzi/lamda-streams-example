package introduction;

import data.DataLoader;

import java.util.List;
import java.util.Optional;

public class FindFirstElement {

    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();

        List<String> elements = dataLoader.createElementList();
        final Optional<String> found = elements.stream()
                .filter((element) -> element.startsWith("F"))
                .findFirst();
        if(found.equals(Optional.empty())){
            System.out.println("Nothing found");
        } else {
            System.out.println(found.get());
        }

    }
}
